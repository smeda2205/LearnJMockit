package com.learn.jmockit;

import static org.junit.Assert.assertEquals;
import mockit.Mock;
import mockit.MockUp;

import org.junit.Test;

public class TestStaticInitializationBlockMocking {
	
	@Test
	public void testStaticInitializationBlock() {
		
		new MockUp<Bank>(){
			@Mock
			public void $clinit() {
				Bank.updateBalance(500);
			}
		};
		
		assertEquals("The Balance Amount is 500", 500, Bank.balanceAmount);
	}
}
