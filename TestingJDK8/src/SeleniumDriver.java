import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumDriver {

	

    static WebDriver driver;
    

    
	
	
    public static WebDriver getDriver(String WebSite) {

    System.setProperty("webdriver.chrome.driver", "C:/Users/free/Documents/ELTE/testing/selenium/chromedriver.exe");
    driver = new ChromeDriver();

    driver.get(WebSite);
    
    return driver;
    
    
    

    }
    
    
   
    
    
}
