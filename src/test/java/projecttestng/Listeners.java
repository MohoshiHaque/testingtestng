package projecttestng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
    @Override
    public void onTestSuccess(ITestResult result) {
        // This method will be called when a test method succeeds.
    	System.out.println("I am passed leave me alone");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // This method will be called when a test method fails.
    	System.out.println("I am failed, please help me");
    }
	

}
