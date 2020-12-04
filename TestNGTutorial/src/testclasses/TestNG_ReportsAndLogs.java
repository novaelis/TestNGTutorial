package testclasses;

import org.testng.annotations.Test;

import jdk.javadoc.doclet.Reporter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNG_ReportsAndLogs {

	@BeforeClass
	public void setUp() {
		//System.out.println("TestNG_ReportsAndLogs -> This runs once before class");
		org.testng.Reporter.log("TestNG_ReportsAndLogs -> This runs once before class", true);
	}

	@AfterClass
	public void cleanUp() {
		//System.out.println("TestNG_ReportsAndLogs -> This runs once after class");
		org.testng.Reporter.log("TestNG_ReportsAndLogs -> This runs once after class",true);
	}

	@BeforeMethod
	public void beforeMethod() {
		//System.out.println("TestNG_ReportsAndLogs -> This runs before every method");
		org.testng.Reporter.log("TestNG_ReportsAndLogs -> This runs before every method",true);
	}

	@AfterMethod
	public void afterMethod() {
		//System.out.println("TestNG_ReportsAndLogs -> This runs after every method");
		org.testng.Reporter.log("TestNG_ReportsAndLogs -> This runs after every method",true);
	}

	@Test
	public void testMethod1() {
		//System.out.println("TestNG_ReportsAndLogs -> testMethod1");
		org.testng.Reporter.log("TestNG_ReportsAndLogs -> testMethod1",true);
	}

	@Test
	public void testMethod2() {
		//System.out.println("TestNG_ReportsAndLogs -> testMethod2");
		org.testng.Reporter.log("TestNG_ReportsAndLogs -> testMethod2",true);		
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "testMethod2")
	public void testMethod3() {
		//System.out.println("TestNG_ReportsAndLogs -> testMethod3");
		org.testng.Reporter.log("TestNG_ReportsAndLogs -> testMethod3",true);
	}

}
