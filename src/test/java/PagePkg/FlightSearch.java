package PagePkg;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
 
 Task automates in this page are :
 1.selecting flight menu
 2.selcting the flighttype,destination,date
 3.selecting passegener ,class,payemnt mode
 4.Screenshot of above activites
 
 */

public class FlightSearch {
	
	
     WebDriver driver;//null

	 JavascriptExecutor js = (JavascriptExecutor) driver;  
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[1]/div/a[1]")
	WebElement flightTab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[1]/div/div/button[1]")
	WebElement flightType;
	
	@FindBy(xpath="//*[@id=\"outboundSearchQuery\"]")
	WebElement from;
	
	@FindBy(css="#outboundSearchQueryList > div.efccBXJTuhBXu1zVMKxN > div:nth-child(2)")
	WebElement fromSuggestion;
	
	
	@FindBy(css="#inboundSearchQueryList > div.efccBXJTuhBXu1zVMKxN > div:nth-child(3)")
	WebElement toSuggestion;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div/div[1]/div[1]/div[1]")
	WebElement depart;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div[3]/div[2]/div[3]/div[30]/div")
	WebElement date;
	
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[1]/div/div")
	WebElement directclick;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[2]/div[1]")
	WebElement options;

	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[2]/div[1]/div/div[1]/div[2]/button[2]")
	WebElement adults ;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/button[2]")
	WebElement child ;
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[2]/div[1]/div/div[3]/div[2]/button[2]")
	WebElement infant ;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[2]/div[1]/div/div[4]/button")
	WebElement apply ;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[2]/div[2]")
	WebElement coptions;

	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div[2]/div[2]/div/div[2]")
	WebElement first;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[4]/div[2]/div")
	WebElement uncheck;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement submit;

	
	

	//constructor
	public FlightSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	//methods
	public void clickFlightTab()
	{
		flightTab.click();
	}
	
	
	 public void clickOnOneTrip() {
		        flightType.click();
		    }
	 
	 public void cities() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		from.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   fromSuggestion.click();
	   toSuggestion.click();
		 
		
	
	 }
	 
	 public void dateSelect() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		depart.click();
		date.click();
	   
	 }
	
	 public void travellerandclass() throws InterruptedException, Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		directclick.click();
		options.click();
		adults.click();
		child.click();
		infant.click();
		apply.click();
		coptions.click();
		first.click();
		uncheck.click();
		//takes screenshot
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scr, new File("./ScreenShots//flightSearch.png"));
		submit.click();
		
	 
	 }
	 
	
	 
	 

}





