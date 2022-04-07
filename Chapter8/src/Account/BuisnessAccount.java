package Account;

import java.text.NumberFormat;

public class BuisnessAccount extends Account {
 
	private final int w=10;
	
	public BuisnessAccount(double bal, String fn, String ln, String Str. String City, String st, String zip, int f) {
		
		super (bal,fn,ln,str,City,st,zip);
		constructor stub
	}
	
	public void withrdraw (double y) {
		
		if (super.getBalance()>=y) {
			super.deposit(super.getBalance()-y);
				
		}
		else {
			super.deposit(super.getBalance()-y-w);
			
		}
		
		
	}
	
}
