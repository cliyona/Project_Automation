package TestPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagePkg.Register;



public class RegisterTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
    
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.wego.co.in/hotels?modal=signup");
	}
	
	@Test
	public void testlogin() {
		Register ob=new Register(driver);
		ob.setvalues("qwerty@gmail.com","Qwerty123!","Qwerty123!");
		ob.login();
	}
}
