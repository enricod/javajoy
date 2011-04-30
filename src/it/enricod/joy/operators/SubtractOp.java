package it.enricod.joy.operators;

import org.apache.commons.math.FieldElement;

import it.enricod.joy.IStack;
import it.enricod.joy.IStackNode;
import it.enricod.joy.JoyFactory;
import it.enricod.joy.StackNodeType;

public class SubtractOp extends AbstractBaseOperator implements IOperator {

	@Override
	public IStack execute(IStack stack) throws OperatorException {
		IStackNode n0 = stack.getElementAt(0);
		IStackNode n1 = stack.getElementAt(1);
		if (n0.getType() == StackNodeType.FIELD_ELEMENT && n1.getType() == StackNodeType.FIELD_ELEMENT) {
			FieldElement resultElement = (FieldElement) n1.getElement().subtract(n0.getElement());

			stack.pop();
			stack.pop();
			stack.push(JoyFactory.createNode(resultElement));
		}
		return stack;
	}

}
