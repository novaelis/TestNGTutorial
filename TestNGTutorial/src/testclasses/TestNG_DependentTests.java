package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import appcode.SomeClassToTest;

public class TestNG_DependentTests {
	
	SomeClassToTest obj;
	@BeforeClass
	public void setUp() {
		System.out.println("TestNG_DependentTests -> This runs once before class");
		
	}

	@Test(dependsOnMethods = "testMethod2")
	public void testMethod1() {
		System.out.println("testMethod1");
		
	}

	@Test
	public void testMethod2() {
		System.out.println("testMethod2");
		obj = new SomeClassToTest();
		int result = obj.sumNumbers(1, 2);
		Assert.assertEquals(result, 2);
	}

	@Test(dependsOnMethods = "testMethod1")
	public void testMethod3() {
		System.out.println("testMethod3");
	}

	@Test(dependsOnMethods = "testMethod3")
	public void testMethod4() {
		System.out.println("testMethod4");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("TestNG_DependentTests -> This runs once after class");
	}

}
