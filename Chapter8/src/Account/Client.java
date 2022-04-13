package Account;
import java.util.Scanner;


public class Client {
	public static void main(String[] args) {
         
		
		Scanner input = new Scanner(System.in);	
		
		
		
		System.out.println("Customer info");
		 
		Customer c1 = new Customer("Suraj ", " Dangwal ", "649 Coventry Dr NE", "Calgary", "Canada", "T3K 9X9");
		
		System.out.println(c1);
		
		
	
		System.out.println("\nSelect from the provided options \n1.Personal account \t2. Business Account \nEnter option (1 or 2):");
		
		
		
		String sel=input.next();
		
		
		if(sel.equals("1")) {
		
			PersonalAccount acct = new PersonalAccount(200.00);
	
			System.out.println(acct);
			
			System.out.println("\nWithdrawing $CAD 250 : ");
	
			System.out.println("\n$ 2 should be charged as account balance is below $100: ");
	        
			
			acct.withdrawal(10);
	        
			
			
			System.out.println("\nAccount balance: " + acct.getBalance());
		

		

		
		}
		
		else if(sel.equals("2")){
		
		
				
			BuisnessAccount acct3 = new BuisnessAccount(10000);
	
			
			System.out.println(" Account balance: " + acct3.toString());
			
	
			System.out.println("\nWithdrawing U$SD 200 : ");
	
			
			System.out.println("\n$ 10 should be charged as account balance is below $500: ");
	       
			
			
			acct3.withdrawal(200);
			
			 
	
			System.out.println("\nAccount balance: " + acct3.toString());
		}
	
	
	
	}
}