package model;

public class SavingsAccount extends Account {
	private double monthlyInterestRate;
	private double monthlyInterestPayment;
	
	
	
public SavingsAccount(double balance, double monthlyInterestRate) {
		super(balance);
		this.monthlyInterestRate = monthlyInterestRate;
		setBalance(balance);
	}



public SavingsAccount(double balance) {
		super(balance);
	}



public double interestPayment() {
	 monthlyInterestPayment = getBalance()*monthlyInterestRate;
	return (monthlyInterestPayment);
}

public void applyPaymentToBalance() {
	setBalance(getBalance()+ monthlyInterestPayment);
}

public void calculateMonthlyInterestPayment() {
	monthlyInterestPayment = getBalance() * monthlyInterestRate;
}
public double getMonthlyInterestPayment() {
	return monthlyInterestPayment;
}



}
