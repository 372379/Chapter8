package Account;

import java.text.NumberFormat;

public class BuisnessAccount extends Account
{
 
	public double balance;
	public BuisnessAccount(String f, String l, double b) {
	super(f,l);
	balance= b;
}

	public double getBalance() 
{
return(balance);	
}

	public void withdraw(double x) 
{
		if(balance>=x) 
 {
			if(x>=500) 
	 {
		balance=balance-x; 
		 
	 }
	 else
	 {
		 
		 balance = balance-x-10;
	 }
   }	
}

	public void deposit(double added) {
			balance=balance+ added;
}

	public String toString() 
{
		NumberFormat money = NumberFormat.getInstance();
		return(" You have $ " + money.format(balance)+ " in your account. ");
}
}
