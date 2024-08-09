package TestPkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagePkg.WegoSignIn;



public class WegoSignInTest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
	 driver.get("https://www.wego.co.in/hotels?modal=login");	
	}
	
	@Test
	public void testlogin()
	{
		WegoSignIn ob=new WegoSignIn(driver);
		ob.setvalues("cleona@gmail.com", "Qwert1234!");
	}

}
