package TestPkg;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import PagePkg.HomePage;




	public class HomePageTest {
		
		WebDriver driver;
		@BeforeTest
		public void setup()
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
			driver=new ChromeDriver(options);
					
		}
	    
		@BeforeMethod
		public void url()
		{
			  
			
			driver.get("https://www.wego.co.in/");
			 driver.manage().window().maximize();
		}
		
		@Test
		public void Home() throws Throwable {
			HomePage hp=new HomePage(driver);
			hp.regionclick();
			hp.languageclick();
		    hp.currencyclick();
		    hp.loginbutton();
		    hp.setvalues("cliyona@gmail.com","Qwerty123!");
		    hp.login();
		  
	   
		
			
		}
		
		@Test(priority=2)
		public void TripIdeas() throws Throwable {
			HomePage hp=new HomePage(driver);
		  hp.TripIdeasFromIndia();	
		}
		
		
		@Test(priority=3)
		public void TripMenus() throws Throwable {
			HomePage hp=new HomePage(driver);
			hp.blog();
		}
	}
