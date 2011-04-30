package it.enricod.joy;

import java.util.Stack;

public class JoyStack implements IStack {

	Stack<IStackNode> nodes = new Stack<IStackNode>();

	@Override
	public IStackNode pop() {
		return nodes.pop();
	}

	@Override
	public IStackNode peek() {
		return nodes.peek();
	}

	@Override
	public void push(IStackNode node) {
		nodes.push(node);
	}

	@Override
	public boolean isEmpty() {
		return nodes.isEmpty();
	}

	@Override
	public IStackNode getElementAt(int index) {
		return nodes.elementAt(nodes.size() - 1 - index);
	}

	@Override
	public int getSize() {
		return nodes.size();
	}



	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < getSize(); i++) {
			buf.append((getSize() - i - 1) + " : ");
			buf.append(nodes.get(i).toString());
			buf.append("\n");
		}

		return buf.toString();

	}

}
