package model;

public class CheckingAccount extends Account{
	private double fee;



	public CheckingAccount(double fee, double balance) {
		super(balance);
		this.setBalance(balance);
		this.fee = fee;
	}



	




	public double getFee() {
		return fee;
	}



	public void setFee(double fee) {
		this.fee = 1.00;
	}



	public void subtractMonthlyFee() {
		this.setBalance(getBalance() - fee);
		
	}
	public double getMonthlyFee() {
		return fee;
	}

}
