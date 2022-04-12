package Account;


public class BuisnessAccount extends Account {

	private double MIN = 500;



	public BuisnessAccount(double bal) {

		super(bal, null, null, null, null, null, null);



	}



	public void withdrawal(double amt) {

		

		double balance = getBalance();



		if (amt <= balance) {

			

			super.withdrawal(amt);




			if (getBalance() < MIN) {

				super.withdrawal(10.00);

			}

		} else {

			System.out.println("Not enough money in account.");

		}

	}


      
	public boolean equals(BuisnessAccount p) {



		if (p.getBalance() == super.getBalance()) {

			return (true);

		} else {

			return (false);

		}

	}


    
	public String toString() {

		String businessacctString;


        
		businessacctString = "The balance is " + super.getBalance();

		return (businessacctString);

	}

}