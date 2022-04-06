package Account;

public class Client {
	
 public static void main (String[]args) {
	
	PersonalAccount t1= new 
	PersonalAccount("Jonathan","Stalin", 98);
	 
	System.out.print(t1.getBalance());
	 
	BuisnessAccount t2= new 
	BuisnessAccount("Harry","Stylin", 100000);
			 
			System.out.print(t2.getBalance());
			
			t1.withdraw(98);
			t2.withdraw(100000);
 
			System.out.print(t1.toString());
			System.out.print(t2.toString());
 }
}
