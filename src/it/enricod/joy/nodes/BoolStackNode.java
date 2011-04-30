package it.enricod.joy.nodes;

import it.enricod.joy.IStackNode;
import it.enricod.joy.StackNodeType;

public class BoolStackNode extends AbstractNode {

	private Boolean value;

	public BoolStackNode(Boolean value) {
		this.value = value;
	}

	@Override
	public StackNodeType getType() {
		return StackNodeType.BOOLEAN;
	}
	
	@Override
	public boolean getBooleanValue() {
		return value.booleanValue();
	}

	@Override
	public IStackNode cloneNode() {
		return new BoolStackNode(value);
	}
	
	
}
