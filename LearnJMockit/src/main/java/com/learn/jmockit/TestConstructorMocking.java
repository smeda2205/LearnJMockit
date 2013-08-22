package com.learn.jmockit;

import static org.junit.Assert.assertNull;
import mockit.Mock;
import mockit.MockUp;

import org.junit.Test;

public class TestConstructorMocking {
	@Test
	public void testDefaultConstructor(){
		new MockUp<Person>() {
			@Mock
			public void $init(){
				//Dont assign name variable at all.
				//Leave it as NULL
			}
		};
		
		Person p = new Person();
		String name = p.getName();
		
		assertNull("Person name is null", name);
	}
	
	@Test
	public void testConstructorWithParameters(){
		new MockUp<Person>() {
			@Mock
			public void $init(String name){
				//Dont assign name variable at all.
				//Leave it as NULL
			}
		};
		
		Person p = new Person("Sample Name");
		String name = p.getName();
		
		System.out.println(name);
		assertNull("Person name is null", name);
	} 
}
