package ie.atu.dip;

import javax.management.RuntimeErrorException;

public class CustomerFactory {
	
	public Customer getCustomerType(int age, int basicInsurance, int accidents) {
	if (age < 17) {
		throw new RuntimeException("Person too young to insure."); //Looking for an exception if age is below 17
	}
		else if (age < 25) {
			return new BelowAgeCustomer(age, basicInsurance, accidents);
		} else if (age < 100) {
			return new AboveAgeCustomer(age, basicInsurance,accidents);
		} else {
			throw new RuntimeException("Person too old to insure.");
		}
	}
}
