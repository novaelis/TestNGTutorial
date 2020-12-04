package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.SomeClassToTest;

public class TestNG_SoftAsserts {
	  @Test
	  public void testSum() {
		  SoftAssert sa = new SoftAssert();
		  System.out.println("Running Test -> testSum");
		  SomeClassToTest obj = new SomeClassToTest();
		  int result = obj.sumNumbers(1, 2);
		  sa.assertEquals(result, 2);
		  System.out.println("Line after assert 1");
		  sa.assertEquals(result, 3);
		  System.out.println("Line after assert 2");
		  
	  }
}
