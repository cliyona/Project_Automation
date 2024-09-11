package TestPkg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import PagePkg.FlightSearch;
import PagePkg.HotelSearch;
import PagePkg.TrainSearch;

public class SearchTest {
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
	
	@Test(priority=1)
	public void testFlight() throws Exception {
		FlightSearch ob=new FlightSearch(driver);
		ob.clickFlightTab();
		ob.clickOnOneTrip();
		ob.cities();
	    ob.dateSelect();
		ob.travellerandclass();
		
	}
	
	
	@Test(priority=2)
	public void testHotel() throws Exception {
		HotelSearch hs=new HotelSearch(driver);
		hs.clickHotelTab();
		hs.destination();
	hs.dateSelect();
	   hs.guestsnroom();	
		
	}
	
	
	
	@Test(priority=3)
	public void testTrain() throws Exception {
		TrainSearch ts=new TrainSearch(driver);
		ts.clickTrainTab();
		ts.trainBook();
	
		
	}


}
