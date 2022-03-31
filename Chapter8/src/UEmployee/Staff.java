package UEmployee;


public class Staff extends Employee{

	private String jobTitle;
	
	public Staff (String fn, String Ln, Integer sal, String jb) {
		
		super(fn,Ln,sal);
		jobTitle = jb;
		
	}
	public String toString() {
		return(super.toString() + " and works as a staff in the "  +  jobTitle +" department. ");
	}
	
}
