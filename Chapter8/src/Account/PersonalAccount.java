package Account;

import java.text.NumberFormat;

public class PersonalAccount extends Account
	{
	 private double MIN = 100;
	 
	 public PersonalAccount(double bal, double MIN) {
		 super (90999,"DAD", "DADS");
		 MIN = MIN;
	 }
	 
	 public void withdrawal(double amt, double balance) {
		 
		 if(amt<= balance) {
			 balance-=amt;
			 if(balance<MIN) {
				 balance = balance - 2;
				 
				 }
		 }
		 else
		 {
			System.out.println("Not enought money in your account ");
			 
			 
		 } 
	 }	
	}
public boolean equals (Object p) {
	PersonalAccount testObj = (PersonalAccount)p;
	
	if (testObj.getBalance()==super.getBalance()) {
		return(true);
		}
	else {
		return(false);
		
	}
	
}


public String toString() {
	
	String PersonalAccountString;
	
	PersonalAccountString = "The Balance is" + super.getBalance();
	return(PersonalAccountString);
	
	
}