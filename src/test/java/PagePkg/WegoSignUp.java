package PagePkg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WegoSignUp {
	WebDriver driver;//null
	By wemail=By.id("email");
	By wpassword=By.id("password");
	By wreppassword=By.id("repeatPassword");
	By wlogin=By.xpath("//*[@id=\"layoutPortalRoot\"]/div/form/div[1]/button[3]");
	
	public WegoSignUp(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setvalues(String email,String password,String repeatpassword) {
		//driver.navigate.refresh();
	
		driver.findElement(wemail).sendKeys(email);
		driver.findElement(wpassword).sendKeys(password);
		driver.findElement(wreppassword).sendKeys(repeatpassword);
	}

	public void login()  {
		
		
		driver.findElement(wlogin).click();
	}


}
