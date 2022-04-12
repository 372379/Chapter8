package Account;


public class PersonalAccount extends Account {


	public PersonalAccount(double bal) {

		super(bal, null, null, null, null, null, null);
	
	}

	public void withdrawal(double amt) {

	     
		if (amt <= super.getBalance() - 2 ) 
		{			

			super.withdrawal(amt);
			
			if (super.getBalance() < 100) {
				super.withdrawal(2.00);
				System.out.println("Not enough money in account.");
			}

		} else {

			System.out.println("Not enough money in account.");
		}
	}

    
	public boolean equals(PersonalAccount p) {
		if (p.getBalance() == super.getBalance()) {
		return (true);
		} else {
			
			return (false);
		}

	}
  
	public String toString() {

		String personacctString;
		personacctString = "The balance is " + super.getBalance();
		return (personacctString);
	}

}