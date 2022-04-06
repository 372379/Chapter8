package Account;

import java.text.NumberFormat;

public class PersonalAccount extends Account
	{

	public double balance;
	
	public PersonalAccount(String f, String l, double b)
	{
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
			if(x>=100) 
	 {
		balance=balance-x; 
		 
	 }
	 else
	 {
		 
		 balance = balance-x-2;
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
