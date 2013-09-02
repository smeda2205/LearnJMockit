package com.learn.jmockit;

import static org.junit.Assert.assertEquals;
import mockit.Mock;
import mockit.MockUp;

import org.junit.Test;

public class MockStaticMethodsUsingMockUp {

	@Test
	public void testMakeConnectionWithMockUp(){
		new MockUp<DBManager>() {
			@Mock
			public String getConnectionString(){
				return "DUPLICATE";
			}
		};
		
		Bank bank = new Bank();
		String status = bank.makeConnection();
		
		assertEquals("Status is FAIL", "FAIL", status);
	}
}
