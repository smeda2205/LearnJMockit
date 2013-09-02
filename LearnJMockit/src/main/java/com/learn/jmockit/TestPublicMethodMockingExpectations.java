package com.learn.jmockit;

import mockit.Expectations;

import org.junit.Test;

public class TestPublicMethodMockingExpectations {
	
	@Test
	public void testRetrieveAccountHolderName(){
		Bank bank = new Bank();
		
		new Expectations() {
			DBManager dbManagerMock;
			{
				dbManagerMock.retrieveAccountHolderName(10);
				returns("Srini");
			}
		};
		
		bank.processAccount(10);
	}
}
