import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GetCanvasData {

	public static List<WebElement> list;
	
	 public static void GetCourses(WebDriver driver){


	         list = driver.findElements((By.className("ic-DashboardCard")));

	        for(WebElement el : list) {
	            System.out.println(el.getAttribute("aria-label"));
	        }






	    }
	 
	 
	 
}
