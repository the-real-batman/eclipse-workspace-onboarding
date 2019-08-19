package com.amdocs;

import javax.naming.InsufficientResourcesException;

public class SavingsAccount {
	
	public double getBalance() {
		System.out.println("Get balance from DB");
		return 7000;
	}
	
	public double withdraw(double amountToBeWithdrawn) 
		throws InsufficientBalanceException{
		System.out.println("Inside withdraw method");
		double currentBalance = getBalance();
		
		if(amountToBeWithdrawn < currentBalance)
			currentBalance = currentBalance - amountToBeWithdrawn;
		else
			throw new InsufficientBalanceException();
		
		updateBalanceIntoDB(currentBalance);
		
		return currentBalance;
	}
	
	public void updateBalanceIntoDB(double currentBalance) {
		System.out.println("Assume here balance is updated in DB");
	}

}
