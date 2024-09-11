package PagePkg;
import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
 * Task done in this pages are:
 * 1.Selecting train tab
 * 2.Selecting menus in the train tab
 * 3.taking screenshots of the above activities
 */

public class TrainSearch {
	WebDriver driver;//null

	 JavascriptExecutor js = (JavascriptExecutor) driver;  
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/a")
	WebElement logo;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[1]/div/a[3]")
	WebElement trainTab;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/input[1]")
	WebElement from;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/input[1]")
	WebElement to;
	

	

	
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/div/div[2]/div/div[3]/div[1]")
	WebElement date;
    
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/div/div[2]/div/div[4]/button")
	WebElement search;
	
	

	//constructor
	public TrainSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	//methods
	public void clickTrainTab()
	{
		logo.click();
		trainTab.click();
	}
	
	
	 public void trainBook()throws Exception {
		 //Window handling for the page Train ticket Booking
		// It will return the parent window name as a String
		 String parent=driver.getWindowHandle();
		 Set<String>s=driver.getWindowHandles();

		 // Now iterate using Iterator
		 Iterator<String> I1= s.iterator();
		 while(I1.hasNext())
		 {
			 String child_window=I1.next();

		 if(!parent.equals(child_window))
		 {
		 driver.switchTo().window(child_window);

		
		 driver.switchTo().window(child_window);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 from.click();
	
		 to.click();
	
		 date.click();
		//takes screenshot
			File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scr, new File("./ScreenShots//trainSearch.png"));
		 search.click();
		 }

		 }
		 //switch to the parent window
		 //driver.switchTo().window(parent);

		 }
		       
		    
	
	 
	
	 
	 

}

