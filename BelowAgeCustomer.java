package ie.atu.dip;

public class BelowAgeCustomer extends Customer{
	
	int surcharge;
	
	BelowAgeCustomer(int age, int basicInsurance, int accidents){
		super(age, basicInsurance, accidents);
		this.surcharge = 100;
}
	@Override
	public int calculatePremium() {
		this.basicInsurance += this.surcharge;
		System.out.println("Additional surcharge " + this.surcharge);
		int total = 0;
		
		switch (this.accidents) {
		case 0:
			total = this.basicInsurance;
			System.out.println("No surcharge");
			System.out.println("Total amount to pay: " + this.basicInsurance);
			break;
		case 1:
			total = this.basicInsurance + 50;
			System.out.println("Additional surcharge for " + this.accidents + " accidents: " + 50 + " \ntotal amount to pay: "
					+ total); // Pay 650
			break;
		case 2:
			total = this.basicInsurance + 125;
			System.out.println("Additional surcharge for " + this.accidents + " accidents: " + 125 + " \ntotal amount to pay: "
					+ total); // Pay 725
			break;
		case 3:
			total = this.basicInsurance + 225;
			System.out.println("Additional surcharge for " + this.accidents + " accidents: " + 225 + " \ntotal amount to pay: "
					+ total); // Pay 825
			break;
		case 4:
			total = this.basicInsurance + 375;
			System.out.println("Additional surcharge for " + this.accidents + " accidents: " + 375 + " \ntotal amount to pay: "
					+ total); // Pay 975
			break;
		case 5:
			total = this.basicInsurance + 575;
			System.out.println("Additional surcharge for " + this.accidents + " accidents: " + 575 + " \ntotal amount to pay: "
					+ total); // Pay 1175
			break;
		}

		if (this.accidents > 5)
			System.out.println("No insurance");
	
	return total;
	}
	
	
	
}
