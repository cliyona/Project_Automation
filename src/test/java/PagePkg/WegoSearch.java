package PagePkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WegoSearch {
	WebDriver driver;//null
	By wflight=By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/a[1]");
    By from=By.xpath("//*[@id=\"outboundSearchQuery\"]");
	//*[@id=\"app\"]/div[2]/div[2]/div[1]/div[1]/div/a[2]
	
	public WegoSearch(WebDriver driver) {
		this.driver=driver;
	}
	

	public void search() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(wflight).click();
		driver.findElement(from).click();
		
	/*
		Select(driver.findElement(from));
		frm.selectByVisibleText("Kannur");
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[@class='bta-description' and text()='Our calculators']//following::div[@class='bta-select-table row']//b[@class='button']"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='selectric-items']//li[contains(., 'Borrowing Capacity')]"))).click();
		
*/
	}
}
