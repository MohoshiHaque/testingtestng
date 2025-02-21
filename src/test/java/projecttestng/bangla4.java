package projecttestng;

import org.testng.annotations.Test;

public class bangla4 {
	
	//Priorty Test
	
	@Test(priority=4)
	public void ademo1() {
		System.out.println("Mohoshi");
	}
	@Test(priority=3)
	public void bdemo1() {
		System.out.println("Momen");
	}
	@Test(priority=2)
	public void cdemo1() {
		System.out.println("Rizvi");
	}
	@Test(priority=1)
	public void ddemo1() {
		System.out.println("Meem");
	}
	
	@Test(dependsOnMethods = {"cdemo1"})
	public void Linked() {
		System.out.println("Haider");
	}
	

}
