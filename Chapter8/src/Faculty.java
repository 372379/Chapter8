
	public class Faculty extends University {
	private String deptName;

	public Faculty(String fn, String Ln, Integer sal, String d) {
	
	super();
	deptName=d;
	
	}
	public String toString() {
		return(super.toString()+""+deptName);
		
		
	}
	}
