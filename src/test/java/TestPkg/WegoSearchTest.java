package TestPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagePkg.WegoSearch;



public class WegoSearchTest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void url()
	{
	 driver.get("https://www.wego.co.in/");	
	}
	
	@Test
	public void testlogin()
	{
		WegoSearch ob=new WegoSearch(driver);
		ob.search();
	
	}


}
