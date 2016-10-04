package com.assignment_4.superclasses;
import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

/**
 * Vi har en BankAccount klass som implementerar från BankOperations. 
 *
 */
public class BankAccount implements BankOperations {
	
	private String accountNumber = ""; 
	private double balance = 0; 
	private String accountType = "";
	
	
	/**
	 * Vi tilldelar accountNumber, balance, accountNumber. 
	 */
	public BankAccount() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6); 
		this.balance = 0; 
		this.accountNumber = "Bank account"; 
	}


	/**
	 * @return accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}


	/**
	 * @param accountNumber instansierar vi med accountNumber som är en parameter i metoden. 
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	/* (non-Javadoc)
	 * @see com.assignment_4.interfaces.BankOperations#withdrawMoney(double)
	 */
	public void withdrawMoney(double amount) {
		if (amount >= 0) {
			setBalance(this.getBalance() - amount); 
		}else {
			System.out.println("You can not withdraw a negative value!"); 
		}
	}
	
	/* (non-Javadoc)
	 * @see com.assignment_4.interfaces.BankOperations#despositMoney(double)
	 */
	public void despositMoney(double amount) {
		if (amount >= 0) {
			setBalance(getBalance() + amount); 
		}else {
			System.out.println("You can not desposit a negative value!");
		}
	}
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", accountType=" + accountType
				+ "]";
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}} 
	
	
