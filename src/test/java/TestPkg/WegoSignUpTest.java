package TestPkg;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import PagePkg.WegoSignUp;

public class WegoSignUpTest {
	
	WebDriver driver;
	 //JavascriptExecutor js;
	@BeforeTest
	public void setup() {
		
		driver=new ChromeDriver();
		  //js = (JavascriptExecutor) driver;
		   // new HashMap<String, Object>();
		
	}
	@BeforeMethod
	public void url()
	{
	 driver.get("https://www.wego.co.in/hotels?modal=signup");	
	}
	
	@Test
	public void testlogin()
	{
		WegoSignUp ob=new WegoSignUp(driver);
		ob.setvalues("cleona@gmail.com", "Qwert123!","Qwert123!");
		ob.login();
	}

}


