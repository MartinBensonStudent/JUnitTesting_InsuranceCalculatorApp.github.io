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

class AboveAgeCustomerTest {

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
		AboveAgeCustomer aboveAgeCustomer = new AboveAgeCustomer(40, 500, 0);
		assertEquals(500, aboveAgeCustomer.calculatePremium());
	}

	@Test
	@Timeout(500)
	public void testCalculatePremiumWithOneAccidents() {
		AboveAgeCustomer aboveAgeCustomer = new AboveAgeCustomer(40, 500, 1);
		assertEquals(550, aboveAgeCustomer.calculatePremium());
	}

	@Test
	@Timeout(500)
	public void testCalculatePremiumWithTwoAccidents() {
		AboveAgeCustomer aboveAgeCustomer = new AboveAgeCustomer(40, 500, 2);
		assertEquals(625, aboveAgeCustomer.calculatePremium());

	}

	@Test
	@Timeout(500)
	public void testCalculatePremiumWithThreeAccidents() {
		AboveAgeCustomer aboveAgeCustomer = new AboveAgeCustomer(40, 500, 3);
		assertEquals(725, aboveAgeCustomer.calculatePremium());
	}

	@Test
	@Timeout(500)
	public void testCalculatePremiumWithFourAccidents() {
		AboveAgeCustomer aboveAgeCustomer = new AboveAgeCustomer(40, 500, 4);
		assertEquals(875, aboveAgeCustomer.calculatePremium());
	}

	@Test
	@Timeout(500)
	public void testCalculatePremiumWithFiveAccidents() {
		AboveAgeCustomer aboveAgeCustomer = new AboveAgeCustomer(40, 500, 5);
		assertEquals(1075, aboveAgeCustomer.calculatePremium());
	}

	@Test
	@Timeout(500)
	public void testCalculatePremiumWithExcessiveAccidents() {
		AboveAgeCustomer aboveAgeCustomer = new AboveAgeCustomer(40, 500, 6);
		assertEquals(0, aboveAgeCustomer.calculatePremium());

	}

	@ParameterizedTest
	@ValueSource(ints = { 27, 34, 54, 66, 87, 98 })
	public void testWithManyDifferentAgesPremiumNotChanged(int age) {
		AboveAgeCustomer aboveAgeCustomer = new AboveAgeCustomer(age, 500, 1);
		assertEquals(550, aboveAgeCustomer.calculatePremium());
	}

	@AfterEach
	public void afterEach() {
		System.out.println("Test finishing...");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("Above age tests took : " + (System.currentTimeMillis() - startTime) + " milliseconds");
	}

}