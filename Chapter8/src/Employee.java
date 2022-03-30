
public class Employee {
private String firstName;
private String LastName;
private Integer salary;

public Employee (String fn, String Ln, Integer sal) {
	
	
	firstName= fn;
	LastName= Ln;
	salary= sal;
	
	
}
public String toString() {
	
	return(firstName+""+LastName+""+salary);
	
	
}
}
