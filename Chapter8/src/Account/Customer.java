package Account;

	public class Customer {
		private String fn;
		private String ln;
		
		
		
		public Customer(String f, String l )
		{
			
		fn= f;
		ln=l;
			
		}
	
		public String getName()
		{
		return(" fn " + " ln ");	
		}
		
		public String toString() 
		{
			return (" Your name is " + fn + "" + ln );
		}
		
		
	}
