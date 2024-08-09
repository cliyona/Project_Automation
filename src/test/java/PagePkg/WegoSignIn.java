package PagePkg;




import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;




	public class WegoSignIn {

		WebDriver driver;//null
		//By wemail=By.id("email");
		//By wpassword=By.id("password");
		By wlogin=By.xpath("//*[@id=\"layoutPortalRoot\"]/div/form/div[2]/button[3]");
		
		/*public WegoSignIn(WebDriver driver) {
			this.driver=driver;
		}
		
		public void setvalues(String email,String password) {
			//driver.navigate.refresh();
			driver.findElement(wemail).sendKeys(email);
			driver.findElement(wpassword).sendKeys(password);
		}*/
	
		public void login() {
			driver.findElement(wlogin).click();
		}
	
	
		
		
		
		

	}

