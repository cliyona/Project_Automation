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
 * 
 */


public class HotelSearch {

	
	
	WebDriver driver;//null

	 JavascriptExecutor js = (JavascriptExecutor) driver;  
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[1]/div/a[2]")
	WebElement hotelTab;
	
	
	@FindBy(id =("destinationSearchQuery"))
	WebElement des;
	
	@FindBy(css="#app > div.H5kGuOuXyvuYLGjCbLSK > div.izA7kC_VrPlQUVlEMJ7t > div.Uuf7CrbcwgyV3_lR7sbS > div.PIQqbVneLCSeY6lry_NH > form > div.F3EW2xtzq5WupoOTqUug > div.wHTh6cwAapGfkWAeHKO0 > div > div.kBtJZSbtiCS4lS6mhgCu > div.DqKau3x4f__kxGIMdsjE > div:nth-child(1) > div")
	WebElement desSuggestion;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div[3]/div[30]/div")
	WebElement date1;	
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/div[1]/div[1]/div")
	WebElement checkIn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div[3]/div[31]/div")
	WebElement date2;

	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/div[1]/div[3]/div")
	WebElement checkOut;
    
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[3]/div/div[1]/div")
	WebElement guestsno ;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]/button[2]")
	WebElement hadults ;
	

	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[4]/button[2]")
	WebElement children ;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[3]/div/div[2]/div/div[2]/button[2]")
	WebElement apply ;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[3]/div/div/div")
	WebElement cancel ;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[4]/div[2]/div")
	WebElement compare;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement hsearch;
	


	

	//constructor
	public HotelSearch (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	//methods
	public void clickHotelTab()
	{
		hotelTab.click();
	}
	
	
	 
	 
	
	 
	 public void destination() throws InterruptedException {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		des.click();
		desSuggestion.click();
		
	
		 
		
		}
	 
	
	 public void dateSelect() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		checkIn.click();	
		date1.click();
	
		checkOut.click();
		date2.click();
		
	 }

	 public void guestsnroom() throws InterruptedException, Exception {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 guestsno.click();
		 hadults.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 children.click();
		 apply.click();
		 cancel.click();
		 compare.click();
		//takes screenshot	
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scr, new File("./ScreenShots//HotelSearch.png"));
		hsearch.click();
		
		
	 
	 }
	 
}
