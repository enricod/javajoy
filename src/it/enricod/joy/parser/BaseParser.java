package it.enricod.joy.parser;

import static it.enricod.joy.parser.ParserUtils.parseNumber;
import static it.enricod.joy.parser.ParserUtils.parseWord;
import it.enricod.joy.IStack;
import it.enricod.joy.IStackNode;
import it.enricod.joy.JoyFactory;
import it.enricod.joy.Pair;
import it.enricod.joy.StackNodeType;
import it.enricod.joy.operators.IOperator;
import it.enricod.joy.operators.OperatorException;

import org.apache.commons.math.util.BigReal;

public class BaseParser implements IParser {


	@Override
	public IStack parse(String str) {
		IStack result = JoyFactory.createStack();
		int i = 0;
		while (i < str.length()) {
			char ch = str.charAt(i);
			if (ch == '.') {
				try {
					return exec(result);
				} catch (OperatorException e) {
					e.printStackTrace();
				}
			} else if (isDigit(ch)) {
				Pair<Integer, BigReal> res = parseNumber(str, i);
				result.push(JoyFactory.createNode(res.getSecond()));
				i = res.getFirst().intValue();
			} else if (isLetter(ch)) {
				Pair<Integer, String> res = parseWord(str, i);
				IOperator op = JoyFactory.getOperatorsRegistry().getOperator(res.getSecond());
				result.push(JoyFactory.createNode(op));
				i = res.getFirst().intValue();
			} else if (isSpace(ch)) {
				i++;
			} else {
				i++;
			}

		}

		return result;
	}

	protected IStack exec(IStack stack) throws OperatorException {
		IStackNode node = stack.peek();
		if (node.getType() == StackNodeType.OPERATOR) {
			stack.pop();
			IOperator operator = node.getOperator();
			return operator.execute(stack);
		}
		return stack;

	}

	protected boolean isLetter(char c) {
		return !isSpace(c) && ! isDigit(c);
	}

	protected boolean isSpace(char c) {
		return c == ' ' || c == '\t' || c == '\n' || c == '\r';
	}

	protected boolean isDigit(char c) {
		return Character.isDigit(c);
	}

}
