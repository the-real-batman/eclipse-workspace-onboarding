package com.amdocs;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest {
	
	private SavingsAccount account;
	private SavingsAccount accountSpy;
	
	@Before
	public void setUp() {
		account= new SavingsAccount();
		accountSpy= spy(account);
	}
	
	@After
	public void tearDown() {
		account =null;
		accountSpy= null;
	}

	@Test
	public void testWithdrawWhenCurrentBalanceIs5000INR() throws InsufficientBalanceException {
		
		//partial mocking
		
		//stubbing - hard coding response of a method
		doReturn (5000.0).when(accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		
		double updateBalance = accountSpy.withdraw(1000.0);
		double expectedBalance= 4000.0;
		
		assertEquals(expectedBalance,updateBalance,0.001);
		
		//check if getBalance method was invoked exactly once
		verify( accountSpy,times(1) ).getBalance();
		//check if UpdateInto DB method was invoked
		verify( accountSpy,times(0) ).updateBalanceIntoDB(anyDouble());
	}
	
	@Test
	public void testWithdratWhenCurrentBalanceIsInsufficient() {
		
		boolean exceptionThrown = false;
		//stubbing - hard coding response of a method
		doReturn (5000.0).when(accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		
		//code under test
		try {
			accountSpy.withdraw(10000.00);
		}
		catch(InsufficientBalanceException e) {
			exceptionThrown= true;
		}
		
		boolean expectedResponse= true;
		assertEquals(expectedResponse,exceptionThrown);

	}
	
}
