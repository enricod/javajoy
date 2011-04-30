package it.enricod.joy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import it.enricod.joy.operators.AddOp;
import it.enricod.joy.operators.OperatorException;

import org.apache.commons.math.FieldElement;
import org.apache.commons.math.util.BigReal;
import org.junit.Test;

public class JoyStackTests {

	private JoyStack createStack(FieldElement<BigReal> v0, FieldElement<BigReal> v1) {
		JoyStack stack = new JoyStack();
		assertTrue(stack.isEmpty());

		IStackNode n0 = JoyFactory.createNode(v0);
		stack.push(n0);
		
		IStackNode n1 = JoyFactory.createNode(v1);
		stack.push(n1);
		return stack;
	}
	
	@Test
	public void push() {
		FieldElement<BigReal> v0 = new BigReal(1);
		FieldElement<BigReal> v1 = new BigReal(2); 
		JoyStack stack = createStack(v0, v1);
		
		assertEquals(2, stack.getSize());
		assertEquals(v1, stack.peek().getElement());
	}
	
	@Test
	public void getAt() {
		FieldElement<BigReal> v1 = new BigReal(1);
		FieldElement<BigReal> v2 = new BigReal(2); 
		JoyStack stack = createStack(v1, v2);
		
		assertEquals(2d, ((BigReal)stack.getElementAt(0).getElement()).doubleValue(), 0.01);
		assertEquals(1d, ((BigReal)stack.getElementAt(1).getElement()).doubleValue(), 0.01);
	}
	
	@Test
	public void execAdd() {
		FieldElement<BigReal> v0 = new BigReal(1);
		FieldElement<BigReal> v1 = new BigReal(2); 
		JoyStack stack = createStack(v0, v1);
		AddOp add = new AddOp();
		try {
			IStack newStack = add.execute(stack);
			assertEquals(1, newStack.getSize());
			assertEquals(3d, ((BigReal)newStack.peek().getElement()).doubleValue(), 0.01);
		} catch (OperatorException e) {
			fail(e.getMessage());
		}
		
	}
	
}
