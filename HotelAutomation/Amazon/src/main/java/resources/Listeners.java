package resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listeners implements ITestListener{
  @Test
  public void TestNGListeners() {
  }

public void onFinish(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext arg0) {
	// TODO Auto-generated method stub
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

public void onTestFailure(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

public void onTestSkipped(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

public void onTestStart(ITestResult arg0) {
	// TODO Auto-generated method stub
	
}

public void onTestSuccess(ITestResult arg0) {
	// TODO Auto-generated method stub
	System.out.println("The test is finish "+ITestResult.SUCCESS);
}
}
