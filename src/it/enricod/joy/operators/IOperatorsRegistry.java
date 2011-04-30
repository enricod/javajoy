package it.enricod.joy.operators;

public interface IOperatorsRegistry {

	
	IOperator getOperator(String name);
	
	void init();
}
