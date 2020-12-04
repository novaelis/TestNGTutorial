package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import appcode.SomeClassToTest;

public class TestNG_EnableTimeout {
	@BeforeClass
	public void setUp() {
		System.out.println("TestNG_EnableTimeout -> This runs once before class");

	}

	@Test(enabled = false)
	public void testMethod1() {
		System.out.println("testMethod1");

	}

	@Test(timeOut = 100)
	public void testMethod2() throws InterruptedException {
		System.out.println("testMethod2");
		Thread.sleep(200);
	}


	@AfterClass
	public void cleanUp() {
		System.out.println("TestNG_EnableTimeout -> This runs once after class");
	}
}
