package it.enricod.joy.nodes;

import it.enricod.joy.IStackNode;
import it.enricod.joy.StackNodeType;
import it.enricod.joy.operators.IOperator;

import org.apache.commons.math.FieldElement;
import org.apache.commons.math.util.BigReal;

public class RealFieldStackNode extends AbstractNode implements IStackNode {

	private FieldElement fieldElement = null;
	
	public RealFieldStackNode(FieldElement fieldElement) {
		this.fieldElement = fieldElement;
	}

	@Override
	public StackNodeType getType() {
		return StackNodeType.FIELD_ELEMENT;
	}

	@Override
	public FieldElement getElement() {
		return fieldElement;
	}

	@Override
	public String toString() {
		if (fieldElement instanceof BigReal) {
			return ((BigReal) fieldElement).bigDecimalValue().toString();
		}
		return fieldElement.toString();
	}

	@Override
	public IOperator getOperator() {
		return null;
	}

	@Override
	public RealFieldStackNode cloneNode() {
		return new RealFieldStackNode(fieldElement);
	}

}
