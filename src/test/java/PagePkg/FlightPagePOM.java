package PagePkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPagePOM {
	 WebDriver driver;
	    JavascriptExecutor js = (JavascriptExecutor) driver;  
	    
	    @FindBy(xpath="//*[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[1]/a")
	    WebElement flightsTab;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[1]")
	    WebElement flightType;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label")
	    WebElement fromField;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
	    WebElement writeFromField;
	    
	    @FindBy(xpath="//*[text()='Nagpur, India']")
	    WebElement selectFromSuggestion;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")
	    WebElement toField;
	    
	    @FindBy(xpath="//*[text()='Bengaluru, India']")
	    WebElement selectToSuggestion;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[4]")
	    WebElement dDate;
	    
	    //@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[7]")
	    //WebElement rDate;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]")
	    WebElement optionBox;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/li[1]")
	    WebElement adults;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/div/div[1]/ul/li[2]")
	    WebElement children;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/div/div[2]/ul/li[1]")
	    WebElement infant;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[2]/li[3]")
	    WebElement tClass;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[2]/button")
	    WebElement apply;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[1]/p")
	    WebElement fare;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")
	    WebElement searchBtn;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/span")
	    WebElement lockPrice;
	    
	    @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[3]/div/label[1]/div/span[2]/span/span")
	    WebElement oneStopD;
	    
	    //@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[4]/div/div[1]/div/label[1]/div/span[1]/span")
	    //WebElement oneStopR;

	[![flight selection][1]][1] 

	    @FindBy(xpath="//*[@id="bookbutton-RKEY:b204bbe6-210d-4197-a91e-1bad39c6ad9f:0_0"]")
	    WebElement flight;
	    
	    @FindBy(id="bookbutton-RKEY:c3d9b30d-d2f7-42fb-a99c-2ddf401a2326:5_1")
	    WebElement bookBtn;
	    
	    //////////////////////////////////////////////////////////////
	    

	    //constructor
	    public FlightPagePOM(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }
	    
	    //methods
	    public void clickFlightTab() {
	        flightsTab.click();
	    }
	    
	    public void clickOnRoundTrip() {
	        flightType.click();
	    }
	    
	    public void cities (String from, String To) {
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        fromField.click();
	        writeFromField.sendKeys(from);
	        selectFromSuggestion.click();
	        toField.sendKeys(To);
	        selectToSuggestion.click();
	    }

	    
	    public void dates() {
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        dDate.click();
	        //rDate.click();
	    }
	    
	    public void travellersAndClass () {
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        optionBox.click();
	        adults.click();
	        children.click();
	        infant.click();
	        tClass.click();
	        apply.click();
	    }
	    
	    public void search () {
	        fare.click();
	        searchBtn.click();  
	    }
	    
	    public void flights () {
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        lockPrice.click();
	        oneStopD.click();
	        //oneStopR.click();
	        flight.click();
	        bookBtn.click();
	    }
	    
	    public void test() {
	        
	    }
	}

}
