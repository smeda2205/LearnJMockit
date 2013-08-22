package com.learn.jmockit;

public class Person {
	private String name;

	public Person() {
		this.setName("Srini By Default");
	}

	public Person(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
