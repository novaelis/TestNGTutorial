package testclasses;

import org.testng.annotations.Test;

import appcode.SomeClassToTest;

public class TestNG_TestAnnotation {
  @Test
  public void testMethod1() {
	  
	  SomeClassToTest obj = new SomeClassToTest();
	  int result = obj.sumNumbers(1, 1);
	  System.out.println("Running Test -> testMethod1");
  }
  
  @Test
  public void atestMethod2() {
	  
	  SomeClassToTest obj = new SomeClassToTest();
	  System.out.println("Running Test -> testMethod2");
  }
  
  @Test
  public void testMethod3() {
	  
	  SomeClassToTest obj = new SomeClassToTest();
	  System.out.println("Running Test -> testMethod3");
  }
}
