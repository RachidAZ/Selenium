import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;


public class LogoutCanvasSelenium extends AuthenticationSelenium {

	

	public static String Logout (final WebDriver driver) {

		
		wait = WaitSelenium.getWait(driver, 30);
		
		// if we are in the download page , we have to close it first
		if(driver.findElement(By.className("icon-end")).isDisplayed() )
			driver.findElement(By.className("icon-end")).click();
		

        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {


                return  (driver.findElement(By.className("ic-avatar ")).isDisplayed() );
            }
        });



        driver.findElement(By.className("ic-avatar ")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).submit();




        return "";


    }
	
	
	
	
	
}
