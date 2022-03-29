
	public class Faculty extends Uemployee {
	private String deptName;

	public Faculty(String fn, String Ln, Integer sal, String d) {
	
	super(fn,Ln,sal);
	deptName=d;
	
	}
	public String toString() {
		return(super.toString()+""+deptName);
		
		
	}
	}
