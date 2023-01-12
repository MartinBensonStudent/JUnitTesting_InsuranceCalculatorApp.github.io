package ie.atu.dip;

import java.util.Scanner;

public class InsuranceProgram {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int basicInsurance = 500;

		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		System.out.print("\nHow many accidents did you have? ");
		int accidents = input.nextInt();
		
		//Use factory pattern to figure out whether a customer is above or below age 25
		CustomerFactory customerFactory = new CustomerFactory();
		Customer customer = customerFactory.getCustomerType(age, basicInsurance, accidents);
		customer.calculatePremium();
	}
}
	