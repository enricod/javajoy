package it.enricod.joy.nodes;

import org.apache.commons.math.FieldElement;

import it.enricod.joy.IStackNode;
import it.enricod.joy.StackNodeType;
import it.enricod.joy.operators.IOperator;

public abstract  class AbstractNode implements IStackNode {

	@Override
	public abstract StackNodeType getType();

	@Override
	public FieldElement getElement() {
		return null;
	}

	@Override
	public IOperator getOperator() {
		return null;
	}

	@Override
	public boolean getBooleanValue() {
		return false;
	}
	
	@Override
	public abstract IStackNode cloneNode();

}
