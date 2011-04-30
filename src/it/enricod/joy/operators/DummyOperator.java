package it.enricod.joy.operators;

import it.enricod.joy.IStack;

public class DummyOperator implements IOperator {

	private String name;
	public DummyOperator(String name) {
		this.name = name;
	}
	
	@Override
	public IStack execute(IStack stack) throws OperatorException {
		System.out.println("Operator '" + name + "' is ndefined");
		return stack;
	}

}
