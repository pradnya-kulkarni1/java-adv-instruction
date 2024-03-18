package model;

import utility.Console;

public class Account implements Depositable, Withdrawable, Balanceable{
	
	 private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", getBalance()=" + getBalance() + "]";
	}

	@Override
	public double getBalance() {
		
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		this.balance = amount;
		
	}

	@Override
	public void withdraw(double amount) {
		
		balance = balance - amount;
		
	}

	@Override
	public void deposit(double amount) {
		
		balance = balance + amount;
		
	}
	

}
