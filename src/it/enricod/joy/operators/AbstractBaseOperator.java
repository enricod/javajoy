package it.enricod.joy.operators;

import it.enricod.joy.IStack;
import it.enricod.joy.IStackNode;
import it.enricod.joy.StackNodeType;

public abstract class AbstractBaseOperator {

	public boolean checkParameters(IStack stack) {
		if (stack.isEmpty()) {
			return false;
		}
		if (stack.getElementAt(0) == null) {
			return false;
		}
	
		if (stack.getElementAt(1) == null) {
			return false;
		}
	
		IStackNode n0 = stack.getElementAt(0);
		IStackNode n1 = stack.getElementAt(1);
		if (n0.getType() == StackNodeType.FIELD_ELEMENT && n1.getType() == StackNodeType.FIELD_ELEMENT) {
			return true;
		}
		return false;
	}

	
}
