package com.assignment_4.subclasses;
import java.util.ArrayList;

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;

/**
 * vi har en class BankCustomer som �rver fr�n klassen human. 
 * Vi har �ven en konstruktor BankCustomer med putName och putAge som parameter.  
 *
 */
public class BankCustomer extends Human  { 
	
	public BankCustomer(String putName, int putAge) {
		super("Johan", 19); 
		
	}
	
	private ArrayList<BankAccount> customerAccounts = new ArrayList<BankAccount>();

	/**
	 * @return customerAccounts. 
	 */
	public ArrayList<BankAccount> getBank() {
		return customerAccounts;
	}

	/**
	 * @param customerAccounts
	 */
	public void setBank(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts; 
	}  
	
	/**
	 * @param bankAccount
	 */
	public void addAccount(BankAccount bankAccount) {
		customerAccounts.add(bankAccount);  
	}
	
	/**
	 * @param accountNumber, som vi har som en parameter i despositToAccount.
	 * @param amount, som vi ocks� har som en paramter i despositToAccount. 
	 * Vi loopar �ven l�ngden av customerAccounts och f�r varje loop s� kollar vi ifall customerAccounts med index(i) �r lika med accountNumber.
	 * 
	 */
	public void despositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if(customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).despositMoney(amount); 
			}
		}
	}
	
	/**
	 * @param accountNumber, parameter i withdrawFromAccount
	 * @param amount, parameter i withdrawFromAccount. 
	 * Vi foor-loopar storleken av customerAccounts. 
	 */
	public void withdrawFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < customerAccounts.size(); i++) {
			if(customerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				customerAccounts.get(i).despositMoney(amount); 
			}
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * @return "BankAccount [customerAccounts=" + customerAccounts + "]";
	 */
	@Override
	public String toString() {
		return "BankAccount [customerAccounts=" + customerAccounts + "]";
	}

	/**
	 * @return customerAccounts
	 */
	public ArrayList<BankAccount> getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * @param customerAccounts 
	 * vi instansierar v�r customerAccounts med customerAccounts som vi har i v�ran ArrayList. 
	 */
	public void setCustomerAccounts(ArrayList<BankAccount> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}

	
	
	
	
		
	
	
	
}
