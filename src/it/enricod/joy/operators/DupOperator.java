package it.enricod.joy.operators;

import it.enricod.joy.IStack;
import it.enricod.joy.IStackNode;

public class DupOperator implements IOperator {

	@Override
	public IStack execute(IStack stack) throws OperatorException {
		if (stack.isEmpty()) {
			throw new OperatorException("dup: 1 parameter required");
		}
		IStackNode node = stack.peek();
		stack.push(node.cloneNode());
		return stack;
	}

	
}
