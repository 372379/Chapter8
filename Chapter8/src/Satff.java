
public class Satff extends Uemployee{

	private String jobTitle;
	
	public Staff (String fn, String Ln, Integer sal, String jb) {
		
		super(fn,Ln,sal);
		jobTitle = jb;
		
	}
	public String toString() {
		return(super.toString()+""+jobTitle);
	}
	
}
