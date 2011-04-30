package it.enricod.joy.operators;

import it.enricod.joy.IStack;
import it.enricod.joy.JoyFactory;

import org.apache.commons.math.util.BigReal;

public class PushFieldElementOp implements IOperator {

	private BigReal value;

	public PushFieldElementOp(double v) {
		this.value = new BigReal(v);
	}

	@Override
	public IStack execute(IStack stack) throws OperatorException {
		stack.push(JoyFactory.createNode(value));
		return stack;
	}

}
