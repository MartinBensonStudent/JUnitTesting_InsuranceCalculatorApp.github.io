package ie.atu.dip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BelowAgeCustomerTest {

	static long startTime = 0;

	@BeforeAll
	public static void beforeAll() {
		startTime = System.currentTimeMillis();
		System.out.println("Tests started at: " + startTime);
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("Test starting...");
	}

	@Test
	@Timeout(500)
	public void testCalculatePremiumWithNoAccidents() {
		BelowAgeCustomer belowAgeCustomer = new BelowAgeCustomer(20, 500, 0);
		assertEquals(600, belowAgeCustomer.calculatePremium());
	}

	@Test
	@Timeout(500)
	public void testCalculatePremiumWithOneAccidents() {
		BelowAgeCustomer belowAgeCustomer = new BelowAgeCustomer(20, 500, 1);
		assertEquals(650, belowAgeCustomer.calculatePremium());
	}

	@Test
	@Timeout(500)
	public void testCalculatePremiumWithTwoAccidents() {
		BelowAgeCustomer belowAgeCustomer = new BelowAgeCustomer(20, 500, 2);
		assertEquals(725, belowAgeCustomer.calculatePremium());

	}

	@Test
	@Timeout(500)
	public void testCalculatePremiumWithThreeAccidents() {
		BelowAgeCustomer belowAgeCustomer = new BelowAgeCustomer(20, 500, 3);
		assertEquals(825, belowAgeCustomer.calculatePremium());
	}

	@Test
	@Timeout(500)
	public void testCalculatePremiumWithFourAccidents() {
		BelowAgeCustomer belowAgeCustomer = new BelowAgeCustomer(20, 500, 4);
		assertEquals(975, belowAgeCustomer.calculatePremium());
	}

	@Test
	@Timeout(500)
	public void testCalculatePremiumWithFiveAccidents() {
		BelowAgeCustomer belowAgeCustomer = new BelowAgeCustomer(20, 500, 5);
		assertEquals(1175, belowAgeCustomer.calculatePremium());
	}

	@Test
	@Timeout(500)
	public void testCalculatePremiumWithExcessiveAccidents() {
		BelowAgeCustomer belowAgeCustomer = new BelowAgeCustomer(20, 500, 6);
		assertEquals(0, belowAgeCustomer.calculatePremium());

	}

	@ParameterizedTest
	@ValueSource(ints = { 4, 15, 3, 11, 13, 10 })
	public void testWithManyDifferentAgesPremiumNotChanged(int age) {
		BelowAgeCustomer belowAgeCustomer = new BelowAgeCustomer(age, 500, 1);
		assertEquals(650, belowAgeCustomer.calculatePremium());
	}

	@AfterEach
	public void afterEach() {
		System.out.println("Test finishing...");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("Below age tests took : " + (System.currentTimeMillis() - startTime) + " milliseconds");
	}

}
