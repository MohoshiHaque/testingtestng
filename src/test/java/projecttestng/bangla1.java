package projecttestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bangla1 {
	
	@Test
	public void demo1() {
		System.out.println("Mohoshi");
	}
	
	@Test
	public void demo2() {
		System.out.println("Nowmi");
	}
	
	@Test(groups= {"Smoke"})
	public void Payra1() {
		System.out.println("Hazera");
	}
	
	

}
