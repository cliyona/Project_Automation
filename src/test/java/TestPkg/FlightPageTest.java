package TestPkg;

public class FlightPageTest {
	WebDriver driver;
    FlightPagePOM fp;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver","E:\\Program Files\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        fp=new FlightPagePOM(driver);
    }
    
    @Test(priority=1)
    public void flightsSearch() {
        fp.clickFlightTab();
    }
    
    @Test(priority=2)
    public void roundTrip() {
        fp.clickOnRoundTrip();
    }
    
    @Test(priority=3)
    public void cities() {
        fp.cities("Nagp", "Benga");
    }
    
    @Test(priority=4)
    public void dates() {
        fp.dates(); 
    }

    @Test(priority=5)
    public void travellersAndClass() {
        fp.travellersAndClass();
        }
    
    @Test(priority=6) 
    public void search() {
        fp.search();
        }
    
    @Test(priority=7) 
    public void selectFlight() {
        fp.flights();
        }
    
}

}
