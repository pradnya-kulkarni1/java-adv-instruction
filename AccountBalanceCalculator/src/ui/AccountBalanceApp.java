package ui;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

import model.Account;
import model.CheckingAccount;
import model.SavingsAccount;
import utility.Console;

public class AccountBalanceApp {
	
	private static final String WITHDRAW = "w";
	private static final String DEPOSIT = "d";
	private static final String CHECKING = "c";
	private static final String SAVINGS = "s";
	

	public static void main(String[] args) {
		
		
		NumberFormat nF = NumberFormat.getCurrencyInstance();
		nF.setCurrency(Currency.getInstance(Locale.US));

		
		
		SavingsAccount s1 = new SavingsAccount(1000,0.01);
		CheckingAccount c1 = new CheckingAccount(1.00, 1000.00);
		
		System.out.println("Welcome to the Account Application");
		
		System.out.println("Starting Balances");
		
		System.out.println("Checking: "+nF.format(c1.getBalance()));
		System.out.println("Saving: "+nF.format(s1.getBalance()));
		
		System.out.println("Enter the transactions for the month");
		String yorn = "y";
		
		while(yorn.equalsIgnoreCase("Y"))
		{
			String choice = Console.getString("Withdrawal or deposit? (w/d): ","w","d");
			
			
			
			if (choice.equals(WITHDRAW))
				{
				String accountType = Console.getString("Checking or savings? (c/s): ","c","s");
				Account acct = null;
				
				if(accountType.equalsIgnoreCase("c")) {
					acct = c1;
				}
				else {
					acct = s1;
				}
				if(accountType.equals(SAVINGS)) {
													double amount = Console.getDouble("Amount?: ",0,Double.MAX_VALUE);
													s1.withdraw(amount);
					
												}
				else if(accountType.equals(CHECKING)) {
															double amount = Console.getDouble("Amount?: ");
															c1.withdraw(amount);
														}
				
				}
			if(choice.equals(DEPOSIT))
			{
				String accountType = Console.getString("Checking or savings? (c/s): ");
				
				if(accountType.equals(SAVINGS)) {
													double amount = Console.getDouble("Amount?: ");
													s1.deposit(amount);
					
												}
				else if(accountType.equals(CHECKING)) {
									double amount = Console.getDouble("Amount?: ");
									c1.deposit(amount);
								}
				
				}
			
			yorn = Console.getString("\nContinue? (y/n):");
		}
		
			System.out.println("\nMonthly Payments and Fees");
			System.out.println("Checking fee: \t\t"+ nF.format(c1.getMonthlyFee()));
			System.out.println("Savings interest payment: "+ nF.format(s1.interestPayment()));
			System.out.println("\nFinal Balances");
			s1.calculateMonthlyInterestPayment();
			s1.applyPaymentToBalance();
			c1.subtractMonthlyFee();
			System.out.println("Checking :"+nF.format(c1.getBalance()));
			System.out.println("Savings:"+nF.format(s1.getBalance()));
		
		System.out.println("Bye!");

	}

}
