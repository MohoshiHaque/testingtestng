package projecttestng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class bangla3 {
	
	@Test(groups= {"Smoke"})
	public void demo4() {
		System.out.println("Billah");
	}
	
	@BeforeTest
	public void bftest() {
		System.out.println("Print out before Test");
	}


	
	
	@BeforeSuite
	public void bfsuite() {
		System.out.println("Print out before sutie");
	}
	
	@BeforeClass
	public void bfclass() {
		System.out.println("Print out before every class");
	}


}
