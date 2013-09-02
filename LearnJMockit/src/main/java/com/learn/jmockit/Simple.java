package com.learn.jmockit;

public class Simple {
	private String iAmPrivate(){
		return "Private";
	}
	
	public String publicCallsPrivate(){
		return iAmPrivate();
	}
}

