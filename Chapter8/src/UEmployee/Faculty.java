package UEmployee;


	public class Faculty extends Employee 
	{
	private String deptName;

	public Faculty(String fn, String Ln, Integer sal, String d) {
	
	super(fn,Ln,sal);
	deptName=d;
	
	}
	public String toString() {
		return(super.toString() + " and works as faculty member in the " + deptName + " department. ");
		
		
	}
	}
