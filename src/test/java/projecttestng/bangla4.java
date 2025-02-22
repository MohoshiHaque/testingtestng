package projecttestng;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class bangla4 {
	
	//Priorty Test
	
	@Test(priority=4, enabled=false)
	public void ademo1() {
		System.out.println("Mohoshi");
	}
	
	@Parameters({"url"})
	@Test(priority=3)
	public void bdemo1(String urlrec) {
		System.out.println("Momen");
		System.out.println(urlrec);
	}
	@Test(priority=2)
	public void cdemo1() {
		System.out.println("Rizvi");
		Assert.assertTrue(false);
	}
	@Test(dataProvider="getdata")
	public void ddemo1(String username, String password) {
		System.out.println("Meem");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods = {"cdemo1"})
	public void Linked() {
		System.out.println("Haider");
	}
	
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0]="firstusername";
		data[0][1]="password1";
		
		data[1][0]="secondusername";
		data[1][1]="password2";
		
		data[2][0]="firstusername";
		data[2][1]="password3";
		
		return data;
		
		
	}
	
	
	
	

}
