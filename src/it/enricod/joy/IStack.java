package it.enricod.joy;


public interface IStack {

	IStackNode pop();
	
	IStackNode peek();
	
	void push(IStackNode node);
	
	boolean isEmpty();
	
	IStackNode getElementAt(int index);
	
	int getSize();
	
	
	
}
