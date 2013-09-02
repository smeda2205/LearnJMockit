package com.learn.jmockit;

import static org.junit.Assert.assertEquals;
import mockit.Expectations;

import org.junit.Test;

public class MockStaticMethodsUsingExpectations {
	
	@Test
	public void testMakeConnection(){
		
		new Expectations(){
			DBManager dbManager;
			{
				DBManager.getConnectionString();
				returns("DUPLICATE");
			}
		};
		
		Bank bank = new Bank();
		String status = bank.makeConnection();
		
		assertEquals("Status is FAIL", "FAIL", status);
	}
}
