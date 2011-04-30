package it.enricod.joy.operators;

import it.enricod.joy.IStack;

public interface IOperator {

	IStack execute(IStack stack) throws OperatorException;
	
}
