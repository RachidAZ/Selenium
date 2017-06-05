import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;


public class DownloadSelenium {

	
	
	static Wait<WebDriver> wait;

	public static void DownloadFilesFromPageGroups(final WebDriver driver){
		
	
		 wait = WaitSelenium.getWait(driver, 30);
		 
		
		 driver.findElement(By.cssSelector("a[href*='/groups']")).click();
		
		 wait.until(new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver webDriver) {
	                System.out.println("waiting pahe loading to click group files ...");
	                // login failed
	                return  (driver.findElement(By.cssSelector("a[href*='/groups/270']")).isDisplayed());
	                       
	            }
	        });

		 
		 
		 driver.findElement(By.cssSelector("a[href*='/groups/270']")).click();
		 driver.findElement(By.cssSelector("a[href*='/groups/270/files']")).click();
		 
		 
		 wait.until(new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver webDriver) {
	                System.out.println("waiting page loading to click group files ...");
	                // login failed
	                return  ( driver.findElement(By.className("ef-name-col__link")).isDisplayed());
	                       
	            }
	        });
		 
		 
		  driver.findElement(By.className("ef-name-col__link")).click();
		  
		  driver.findElement(By.className("icon-download")).click();
		  
		  
		  
		 
		
		
	}
	
	
	
	
}
