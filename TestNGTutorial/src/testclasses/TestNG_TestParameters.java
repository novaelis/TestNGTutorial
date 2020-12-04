package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestNG_TestParameters {

	@BeforeClass
	@Parameters({"browser","platform"})
	public void setUp(String browser, String platform) {
		System.out.println("TestNG_TestParameters -> Setup");
		System.out.println("1. Parameter value from xml file: " + browser);
		System.out.println("2. Parameter value from xml file: " + platform);
	}

	@Test
	@Parameters({"response"})
	public void testMethod1(String response) {
		String[] responses = response.split(",");
		System.out.println("TestNG_TestParameters -> testMethod1");
		for (String res : responses) {
			System.out.println("Response from xml file: " + res);
		}
		

	}

}
