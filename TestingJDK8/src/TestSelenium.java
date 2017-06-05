import org.openqa.selenium.WebDriver;



public class TestSelenium {

	public static WebDriver driver;
	public static String USerName;
    
    public static void main(String[] args) {
    	
    	
    	
    	SetDriver();
    	
    	System.out.println("Testing Canvas Project starting ..");
    	
    	System.out.println("Login Testing ..");
    	
    	boolean loginKO=LoginKOTest();
    	
    	if(loginKO==false)
    		System.out.println("Test loginKO is OK!  ");
    	else
    		System.out.println("Test loginKO is Failed !  ");
    	
    	
    	SeleniumNaviguation.goBack();
    	SeleniumNaviguation.goBack();
    	
    	
    		
    	// we will need for futher operation in the website , this test is depend on getData testes
    	boolean loginOK=LoginOkTest();
    	
    	if(loginOK)
    		System.out.println("Test loginOK is OK!  ");
    	else
    		System.out.println("Test loginKO is Failed !  ");
    	
    	
    	
    	
    	System.out.println("The page title is :  "+ AuthenticationSelenium.printTitle(driver) );
    	
    	
    	
    	// display the user Name if LoginOK
    	if ( loginOK)  {
    		System.out.println("UserName : "+USerName);
    		 if (USerName.equals("Azgaou Rachid SPHHU1"))
    		System.out.println("Test 'Get User Name' is OK !  ");
    		 else
    	    System.out.println("Test 'Get User Name' is Failed !  ");
    	
    		 
    	}
    		 
    	System.out.println("Get Courses Testing ..");
    	
    	GetCanvasData.GetCourses(driver);
    	if(GetCanvasData.list!=null)
    		System.out.println("Test 'GetCourses' is OK !  ");
    	else 
    		System.out.println("Test 'GetCourses' is Failed !  ");
    	
    	
    	System.out.println("Download Courses Testing ..");
    	
    	try {
	
    		DownloadSelenium.DownloadFilesFromPageGroups(driver);
    		System.out.println("Test 'DownloadFilesFromPageGroups' is OK !  ");
    		
		} catch (Exception e) {
			System.out.println("Test 'GetCourses' is Failed !  ");
		}
    
    	
    	
    	System.out.println("Logout  Testing ..");
    	
    	
    		LogoutCanvasSelenium.Logout(driver);
    		System.out.println("The page title is :  "+ AuthenticationSelenium.printTitle(driver) );
    		
    		
    		if(AuthenticationSelenium.printTitle(driver).equals("Central login"))
    			System.out.println("Test 'Logout' is Ok !  ");
    		else
    			System.out.println("Test 'logout' is Failed !  ");
    		
    	
    	
    	
    	
    	
    	
    }

	private static void SetDriver() {
		driver=SeleniumDriver.getDriver("https://canvas.elte.hu/belepes/");
		
		
	}

	private static boolean LoginOkTest() {
	
		
		
	String loginDone=	AuthenticationSelenium.Login("SPHHU1", "GoodPasswordHere", driver);
	USerName=loginDone;
	
	if (loginDone==null) return false;
	else return true;
	
		
		
		
	}
	
    
	
	private static boolean LoginKOTest() {
		
		
		
		String loginDone=	AuthenticationSelenium.Login("SPHHU1", "jjedj", driver);
	
		
		if (loginDone==null) return false;
		else return true;
		
			
			
			
		}
    
    
	
}
