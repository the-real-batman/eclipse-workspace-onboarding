package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	
	@Test
	public void testSayHello() {
		Hello hello=new Hello();
		String actualResponse=hello.sayHello();
		String expectedResponse="Hello Maven!";
		assertEquals(expectedResponse,actualResponse);
		
	}
}
