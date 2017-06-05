import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitSelenium {

	
	static Wait<WebDriver> wait;	
	
	public static Wait<WebDriver> getWait(WebDriver driver , int seconds){
		
		 wait = new WebDriverWait(driver, seconds);

		
		return wait;
		
	}
	
}
