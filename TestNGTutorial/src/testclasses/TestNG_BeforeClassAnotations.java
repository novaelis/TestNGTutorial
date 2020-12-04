package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class TestNG_BeforeClassAnotations {
	@org.testng.annotations.BeforeClass
	public void setUp() {
		System.out.println("This runs once before class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("This runs once after class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This runs before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This runs after every method");
	}

	@Test
	public void testMethod1() {
		System.out.println("Running Test -> testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("Running Test -> testMethod2");
	}

}
