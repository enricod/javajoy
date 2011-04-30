package it.enricod.joy;

import it.enricod.joy.operators.IOperator;

import org.apache.commons.math.FieldElement;

public interface IStackNode {

	StackNodeType getType();
	
	FieldElement getElement();
	
	IOperator getOperator();
	
	boolean getBooleanValue();
	
	IStackNode cloneNode();
}
