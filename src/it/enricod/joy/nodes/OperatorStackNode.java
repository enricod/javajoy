package it.enricod.joy.nodes;

import it.enricod.joy.IStackNode;
import it.enricod.joy.StackNodeType;
import it.enricod.joy.operators.IOperator;

import org.apache.commons.math.FieldElement;

public class OperatorStackNode extends AbstractNode implements IStackNode {

	private IOperator operator;

	public OperatorStackNode(IOperator op) {
		this.operator = op;
	}
	@Override
	public StackNodeType getType() {
		return StackNodeType.OPERATOR;
	}

	
	@Override
	public IOperator getOperator() {
		return operator;
	}
	@Override
	public IStackNode cloneNode() {
		return new OperatorStackNode(operator);
	}

}
