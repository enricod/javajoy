package it.enricod.joy;

import it.enricod.joy.nodes.OperatorStackNode;
import it.enricod.joy.nodes.RealFieldStackNode;
import it.enricod.joy.operators.IOperator;
import it.enricod.joy.operators.IOperatorsRegistry;
import it.enricod.joy.operators.OperatorsRegistry;

import org.apache.commons.math.FieldElement;

public class JoyFactory {

	private static IOperatorsRegistry operatorsRegistry = null;
	
	public static IStack createStack() {
		return new JoyStack();
	}
	
	public static IStackNode createNode(FieldElement fieldElement) {
		return new RealFieldStackNode(fieldElement);
	}
	
	public static IStackNode createNode(IOperator op) {
		return new OperatorStackNode(op);
	}
	
	public static IOperatorsRegistry getOperatorsRegistry() {
		if (operatorsRegistry ==null ) {
			operatorsRegistry = new OperatorsRegistry();
			operatorsRegistry.init();
		}
		return operatorsRegistry;
	}
	
}
