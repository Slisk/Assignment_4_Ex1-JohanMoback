package com.assignment_4.main;

import javax.annotation.processing.SupportedSourceVersion;

import com.assignment_4.subclasses.BankCustomer;
import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.SavingAccount;
import com.assignment_4.superclasses.BankAccount;

/**
 * @author Johan
 * @since 4/10-2016
 * @version 1.0
 * 
 *
 */

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String account = ""; 
		
		BankCustomer bc = new BankCustomer("Johan", 19); 
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString()); 
		
		account = bc.getCustomerAccounts().get(0).getAccountNumber(); 
		System.out.println("Depositing 30.0 to the first account");
		bc.despositToAccount(account, 30.0);
		System.out.println(bc.toString());
		
		System.out.println("Withdrawing 200.0 to the first account");
		account = bc.getCustomerAccounts().get(2).getAccountNumber(); 
		bc.despositToAccount(account, 200.0);
		System.out.println(bc.toString()); 
		
		

	}

}
