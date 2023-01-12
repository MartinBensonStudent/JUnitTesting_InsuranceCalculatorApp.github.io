package ie.atu.dip;

public class Customer {
	
	int age;
	int basicInsurance;
	int accidents;
	
	Customer(int age, int basicInsurance, int accidents){
		this.age = age;
		this.basicInsurance = basicInsurance;
		this.accidents = accidents;
	}
	
	
	public int calculatePremium() {
		//Returning 0 here as this will be overridden in child classes.
		return 0;
	}
}
