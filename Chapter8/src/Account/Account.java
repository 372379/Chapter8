package Account;

import java.text.NumberFormat;

public class Account {

	private double balance;
	private Customer cust;
	
	public Account(double bal, String fn, String ln, String Str. String City, String st, String zip) {
		
		balance=bal;
		cust= newCustomer(fn,ln, Str,City,st,zip);
		
	}
	
	public double getBalance() {
		return(balance);
		
		
	}
	
	public void deposity(double amt ) {
		balance+=amt;
		
	}

	public void withdraw (double amt) {
		if (amt<=balance) {
			balance-=amt;
		}
		else
		{
			
			System.out.print(" Not enough money in account ");
		}
	}

	public String toString() {
		String accountString;
		NumberFormat money= NumberFormat.getCurrencyInstance();
		accountString =cust.toString();
		accountString += "Current balance  is " + money.format(balance);
		return (accountString);
		
	} 
	
	
	
}


