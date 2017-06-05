import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;


public class AuthenticationSelenium  {

		
	static Wait<WebDriver> wait;
	
	public static String Login(String login, String password, final WebDriver driver) {

		
		
        driver.findElement(By.cssSelector("a[href*='/login/saml']")).click();
        driver.findElement(By.name("username_neptun")).sendKeys(login);
        driver.findElement(By.name("password_neptun")).sendKeys(password);

        driver.findElement(By.name("password_neptun")).submit();


       wait = WaitSelenium.getWait(driver, 30);


        try {


        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {
                System.out.println("submitting data for login ...");
                // login failed
                return  (driver.findElements(By.className("error-title")).size() > 0 ||
                        driver.findElement(By.id("global_nav_profile_link"))!=null );
            }
        });


            // if login failed
            if ( driver.findElement(By.id("global_nav_profile_link"))!=null)
     
                // if login is successful --> return the Name of the Student
                return driver.findElement(By.tagName("img")).getAttribute("alt");


        } catch (org.openqa.selenium.NoSuchElementException e) {
            // findElement(By.id("global_nav_profile_link") is not found means the login us failed
            return null;
        }


        return null;







    }
	
	

	
	public static String printTitle(WebDriver driver){
		
		return driver.getTitle();
		
		
	}
	
	
	
}
