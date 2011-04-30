package it.enricod.joy.parser;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.apache.commons.math.util.BigReal;
import org.junit.Test;

import it.enricod.joy.IStack;

public class BaseParserTest {

	@Test
	public void parse001() {
		String str = "2 3 + ";
		BaseParser parser = new BaseParser();
		IStack stack = parser.parse(str);
		assertEquals(3, stack.getSize());
	}
	
	
	@Test
	public void parse002() {
		String str = "2 3 + .";
		BaseParser parser = new BaseParser();
		IStack stack = parser.parse(str);
		assertEquals(1, stack.getSize());
		assertEquals(new BigDecimal(5), ((BigReal)stack.peek().getElement()).bigDecimalValue());
	}
	
	
	@Test
	public void parse003() {
		String str = "2 3 - .";
		BaseParser parser = new BaseParser();
		IStack stack = parser.parse(str);
		assertEquals(1, stack.getSize());
		assertEquals(new BigDecimal(-1), ((BigReal)stack.peek().getElement()).bigDecimalValue());
	}
	
	@Test
	public void parseMultiply() {
		String str = "2 3 * .";
		BaseParser parser = new BaseParser();
		IStack stack = parser.parse(str);
		assertEquals(1, stack.getSize());
		assertEquals(new BigDecimal(6), ((BigReal)stack.peek().getElement()).bigDecimalValue());
	}
}
