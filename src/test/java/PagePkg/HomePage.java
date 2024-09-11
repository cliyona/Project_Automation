package PagePkg;


import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*Tasks done has follows:
1.For Selecting home page Buttons Language,Country,Currency,Login.
2.And selecting submenus under "TRIP IDEAS FROM INDIA" sub-heading
3.Opening Stories ,In the Wego travel blog

*The Test page is HomePageTest.java
*/
public class HomePage {
	

		WebDriver driver;//null

		 JavascriptExecutor js = (JavascriptExecutor) driver;  
		
			@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[2]/div/button[1]")
			WebElement country;
			@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[2]/div/div/div[2]/a[1]")
			WebElement india;
		 
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[2]/div/button[2]")
		WebElement language;
		
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[2]/div/div/div[2]/a[1]")
		WebElement english;
		
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[2]/div/button[3]")
		WebElement currency;
		
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[2]/div/div/div[2]/div[2]/div[2]")
		WebElement aed;
		
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[2]/button[2]")
		WebElement getstrtd;
		
		//login
		
		@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[2]/button[1]")
		WebElement loginbtn;
		
		@FindBy(id="email")
		WebElement wemail ;
		
		@FindBy(id="password")
		WebElement wpassword;
		
		
		@FindBy(xpath="//*[@id=\"layoutPortalRoot\"]/div/form/div[2]/button[3]")
		WebElement loginsubmit;
		
		@FindBy(xpath="//*[@id=\"app\"]/div[2]/div[2]/div[5]/div[2]/div/div/a[1]/div[2]/div[1]")
		WebElement stories;
		
		
		
	

		//constructor
		public HomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		
		//methods
		public void regionclick() throws InterruptedException, Exception, Throwable
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			country.click();
			//takes screenshot		
			File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scr, new File("./ScreenShots//CountryClick.png"));
			india.click();
		}
		
		public void languageclick() throws InterruptedException, Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			language.click();
			//takes screenshot		
			File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scr, new File("./ScreenShots//LanguageClick.png"));
			english.click();
		}
		
		public void currencyclick() throws InterruptedException, Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			currency.click();
			//takes screenshot		
			File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scr, new File("./ScreenShots//CurrencyClick.png"));
			aed.click();
		}
		
		public void loginbutton() throws InterruptedException, Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			loginbtn.click();
		}
		
		public void setvalues(String email,String password) {
			wemail.sendKeys(email);
			wpassword.sendKeys(password);
			
		}
		
		public void login() throws InterruptedException, Exception {
			
			
		
			//takes screenshot		
			File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scr, new File("./ScreenShots//Loginpage.png"));
			loginsubmit.click();
			
		}	
		
		public void TripIdeasFromIndia() throws Throwable {
			
			List<WebElement> p = driver.findElements(By.xpath("//*[@id=\"app\"]/div[2]/div[2]/div[8]/div[2]/div[1]"));
		      System.out.println("Menu Items are: ");
		      //iterate through list
		      for( WebElement i: p){
		         System.out.println(i.getText());
				
				  i.click();
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
					
		         }
		}
		
		public void blog() throws Exception {
			stories.click();
			 //Window handling for the blog page
			
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
			//takes screenshot
				File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scr, new File("./ScreenShots//Blog.png"));
			
			// logo.click();
				driver.close();
			 }

			 }
			 //switch to the parent window
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
			 driver.switchTo().window(parent);
			
		}
		

}
