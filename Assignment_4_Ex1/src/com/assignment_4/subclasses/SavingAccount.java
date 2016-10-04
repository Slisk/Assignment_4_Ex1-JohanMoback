package com.assignment_4.subclasses;
import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

/**
 * En klass som �rver fr�n bankAccount. 
 *
 */
public class SavingAccount extends BankAccount {
  
	/**
	 * En konstruktor d�r vi s�tter AccountNumber, balance, AccountType. 
	 */
	public SavingAccount() {	
		
		this.setAccountNumber(UUID.randomUUID().toString().substring(0,6)); 
		this.setBalance(0.0); 
		this.setAccountType("Saving Account"); 
   }	
	
	
} 
