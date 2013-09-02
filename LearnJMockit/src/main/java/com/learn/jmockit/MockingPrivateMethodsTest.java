package com.learn.jmockit;

import static org.junit.Assert.assertEquals;
import mockit.Deencapsulation;
import mockit.Expectations;

import org.junit.Test;

public class MockingPrivateMethodsTest {
	@Test
	public void testPublicInvokesPrivate() {

		final Simple simple = new Simple();

		new Expectations(simple) {
			{
				Deencapsulation.invoke(simple, "iAmPrivate");
				returns("I got invoked");
			}
		};

		String str = simple.publicCallsPrivate();
		assertEquals("The returned string is - I got INVOKED", "I got INVOKED",
				str);
	}
}
