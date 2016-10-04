package com.assignment_4.subclasses;
import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;

/**
 * Vi har en klass PersonalAccount som �rver fr�n BankAccount. 
 * I denna klass har vi en constructor public PersonalAccount.
 * 
 *
 */
public class PersonalAccount extends BankAccount {

	/**
	 * V�r constructor d�r vi s�tter v�r AccountNumber(UUID.randomUUID som vi skirver ut med index fr�n 0-6), Balance och AccountType. 
	 */
	public PersonalAccount() {	
		
		this.setAccountNumber(UUID.randomUUID().toString().substring(0,6)); 
		this.setBalance(0.0); 
		this.setAccountType("Personal Account"); 
   }	
	
	
	
}
