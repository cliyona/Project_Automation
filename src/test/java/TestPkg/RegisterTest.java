package TestPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagePkg.Register;



public class RegisterTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver();
	}
    
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.wego.co.in/hotels?modal=signup");
	}
	
	@Test
	public void testregister() throws Exception {
		Register rtr=new Register(driver);
		rtr.setvalues("cliyona@gmail.com","Qwerty123!","Qwerty123!");
		rtr.login();
	}
}
