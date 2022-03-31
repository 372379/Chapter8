package UEmployee;

import java.util.Scanner;

	public class University {
	
  public static Employee createemployee()
{
	
	Scanner	input = new Scanner(System.in);

	System.out.println("Enter employee's first name ?");
	String fn = input.next();

	System.out.println("Enter employee's Last name ?");
	String Ln = input.next();

	System.out.println("Enter employee's Salary?");
	int sal= input.nextInt();

	System.out.println("Enter employee Type Faculty or Staff ?");
	String empT;
	empT= input.next();
	if(empT.equalsIgnoreCase("F")) {
		
		System.out.println("Enter Department's Name ?");
		String d = input.next();
		
		return new Faculty (fn,Ln,sal,d);
	}
	else
	{
		
		System.out.print("Enter job Title");
		String jb= input.next();
		return new Staff (fn,Ln,sal,jb);
		
		
	}
}
	
	public static void main (String[] args) {
		
		Employee emp1;
		emp1= createemployee();
		System.out.println(emp1);
		
	}
	
}