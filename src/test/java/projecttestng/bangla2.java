package projecttestng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class bangla2 {
	
	@Test
	public void demo3() {
		System.out.println("Akib");
	}
	
	@Test
	public void femo1() {
		System.out.println("Nayem");
	}
	
	
	@BeforeMethod
	public void bfmethod() {
		System.out.println("Print before every method");
	}

}
