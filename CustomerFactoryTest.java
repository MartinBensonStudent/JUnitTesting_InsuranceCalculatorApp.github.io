package ie.atu.dip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CustomerFactoryTest {

	@ParameterizedTest
	@ValueSource(ints = {17, 18, 19, 20, 21 ,22})
	public void testFactoryReturnsBelowAgeClass(int age) {
		CustomerFactory customerFactory = new CustomerFactory();
		Customer customer = customerFactory.getCustomerType(age, 500, 0);

		assertTrue(customer instanceof BelowAgeCustomer);
	}

	@ParameterizedTest
	@ValueSource(ints = {25, 35, 45, 55, 65 ,75})
	public void testFactoryReturnsAboveAgeClass(int age) {
		CustomerFactory customerFactory = new CustomerFactory();
		Customer customer = customerFactory.getCustomerType(age, 500, 0);

		assertTrue(customer instanceof AboveAgeCustomer);
	}

	@Test
	//If age is below 17 throw an exception
	public void testCustomerIsTooYoungException() {
		boolean exceptionCaught = false;
		CustomerFactory customerFactory = new CustomerFactory();

		try {
			customerFactory.getCustomerType(10, 500, 0);
		} catch (Exception e) {
			exceptionCaught = true;
			assertEquals(e.getMessage(), "Person too young to insure.");
		}
		assertTrue(exceptionCaught);
	}

	
	@Test
	//If age is over 100 throw an exception
	public void testCustomerIsTooOldException() {
		boolean exceptionCaught = false;
		CustomerFactory customerFactory = new CustomerFactory();

		try {
			customerFactory.getCustomerType(101, 500, 0);
		} catch (Exception e) {
			exceptionCaught = true;
			assertEquals(e.getMessage(), "Person too old to insure.");
		}
		assertTrue(exceptionCaught);
	}
	
}
