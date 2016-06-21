package Package02;

import org.junit.Test;

import Package01.MessageUtil;

import static org.junit.Assert.assertEquals;

public class TestJunit {

	String message = "Hello World";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		assertEquals(message, messageUtil.printMessage());
	}
}