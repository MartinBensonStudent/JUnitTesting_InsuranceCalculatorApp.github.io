package ie.atu.dip;

public class AboveAgeCustomer extends Customer{
	
	AboveAgeCustomer(int age, int basicInsurance, int accidents){
		super(age, basicInsurance, accidents);
		
	}
		
	@Override
	public int calculatePremium(){
		int total = 0;
		System.out.println("No additional surcharge");
		
		switch (this.accidents) {
		case 0:
			total = this.basicInsurance;
			System.out.println("No surcharge");
			System.out.println("Total amount to pay: " + this.basicInsurance);
			break;
		case 1:
			total = this.basicInsurance + 50;
			System.out.println("Additional surcharge for accident: " + 50 + " \ntotal amount to pay: "
					+ total); // Pay 550
			break;
		case 2:
			total = this.basicInsurance + 125;
			System.out.println("Additional surcharge for accident: " + 125 + " \ntotal amount to pay: "
					+ total); // Pay 625;
			break;
		case 3:
			total = this.basicInsurance + 225;
			System.out.println("Additional surcharge for accident: " + 225 + " \ntotal amount to pay: "
					+ total); // Pay 725;
			break;
		case 4:
			total = this.basicInsurance + 375;
			System.out.println("Additional surcharge for accident: " + 375 + " \ntotal amount to pay: "
					+ total); // Pay 875;
			break;
		case 5:
			total = this.basicInsurance + 575;
			System.out.println("Additional surcharge for accident: " + 575 + " \ntotal amount to pay: "
					+ total); // Pay 1075;
			break;
		}

		if (this.accidents > 5)
			System.out.println("No insurance");
	
	return total ;

	}
	
}
