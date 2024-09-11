package PagePkg;


import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Page for registration
public class Register {
	
	
	WebDriver driver;//null
	@FindBy(id="email")
	WebElement wemail;
	
	@FindBy(id="password")
	WebElement wpassword;
	
	@FindBy(id="repeatPassword")
	WebElement rpassword;
	
	@FindBy(xpath="//*[@id=\"layoutPortalRoot\"]/div/form/div[1]/button[3]")
	WebElement wlogin;
	
	public Register(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setvalues(String email,String password,String repeatpassword) {
		wemail.sendKeys(email);
		wpassword.sendKeys(password);
		rpassword.sendKeys(repeatpassword);
	}
	public void login() throws Exception
	{
		//takes screenshot		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scr, new File("./ScreenShots//Register.png"));
		wlogin.click();
		
	}
}
