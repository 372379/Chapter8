
public class Staff extends University{

	private String jobTitle;
	
	public Staff (String fn, String Ln, Integer sal, String jb) {
		
		super();
		jobTitle = jb;
		
	}
	public String toString() {
		return(super.toString()+""+jobTitle);
	}
	
}
