package com.learn.jmockit;

public class Bank {
	DBManager dbManager = new DBManager();
	static int balanceAmount;

	// Static Block Begins
	static {
		updateBalance(100);
	}

	public static void updateBalance(int balance) {
		balanceAmount += balance;
	}
	
	public String processAccount(int accountId){
		return dbManager.retrieveAccountHolderName(accountId);
	}

}
