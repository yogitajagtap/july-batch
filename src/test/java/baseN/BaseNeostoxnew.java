package baseN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseNeostoxnew
{
	protected WebDriver driver;
    
	public  void Launchneostox() throws InterruptedException
	{
		// launching browser neostox
		
		
	System.setProperty("webdriver.chrome.driver", "F:\\selenium folder\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("https://neostox.com/sign-in");  
		Thread.sleep(1000);
		

	}
	public static void closingBrowser(WebDriver driver) throws InterruptedException
	{
	Reporter.log("closing browser", true);
	Thread.sleep(500);
	driver.close();
	}

}
