package com.learn.jmockit;

import static org.junit.Assert.assertEquals;
import mockit.Mock;
import mockit.MockUp;

import org.junit.Test;

public class TestPublicMethodMockingUsingMockUp {

	@Test
	public void testBankProcessAmount() {
		new MockUp<DBManager>(){
			@Mock
			public String retrieveAccountHolderName(int accountId){
				return "Srini";
			}
		};
		
		Bank bank = new Bank();
		String name = bank.processAccount(10);
		
		assertEquals("Account holder Name for A/C id 20 is 'Srini' ", "Srini", name);
	}
}
