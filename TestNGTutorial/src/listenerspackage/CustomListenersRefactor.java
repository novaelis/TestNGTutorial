package listenerspackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListenersRefactor implements IInvokedMethodListener, ITestListener, ISuiteListener {
	
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// Before every method in the Test Class
		System.out.println("beforeInvocation: " + testResult.getTestClass().getName() +
				" => " + method.getTestMethod().getMethodName());
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// After every method in the Test Class
		System.out.println("afterInvocation: " + testResult.getTestClass().getName() +
				" => " + method.getTestMethod().getMethodName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// When test method starts
		System.out.println("onTestStart -> Test Name: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// if test method is successful
		System.out.println("onTestSuccess -> Test Name: " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// if test method is failed
		System.out.println("onTestFailure -> Test Name: " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// if test method is skipped
		System.out.println("onTestFailure -> Test Name: " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// Before <test> tag in xml file
		System.out.println("onStart -> Test Tag Name: " + context.getName());
		ITestNGMethod methods[] = context.getAllTestMethods();
		System.out.println("These methods will  be executed in this test tag:");
		for (ITestNGMethod iTestNGMethod : methods) {
			System.out.println(iTestNGMethod.getMethodName());
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		// After <test> tag in xml file
		System.out.println("onFinish -> Test Tag Name: " + context.getName());
	}
	
	@Override
	public void onStart(ISuite suite) {
		// When <suite> tag starts
		System.out.println("onStart: before suite starts");
	}

	@Override
	public void onFinish(ISuite suite) {
		// When <suite> tag completes
		System.out.println("onFinish: after suite completes");
	}
}
