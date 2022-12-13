package neoPOM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityNew

{
	public static String ReadDatafromPropertiesFile(String key) throws IOException
	{
	//create object of properties class
	
	Properties prop=new Properties();
	
	//create object of FileInputeStem
	FileInputStream myFile= new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\selenium11\\propertyNG.property");
	
	prop.load(myFile);
	
	String value=prop.getProperty(key);
	Reporter.log("reading value of "+key+" from property file",true);

	return value;

	}
	 public static void Wait(WebDriver driver,int waittime)
	    {			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
			
			
			
			
			
			
			
			Reporter.log("waiting for"+waittime+"mills",true);
	    }
	 public  static void TakeScreenshot(WebDriver driver,String filename ) throws IOException, InterruptedException
	 {	
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
	        File dest=new File("F:\\selenium folder"+filename+"png");
	        FileHandler.copy(source, dest);
	       Thread.sleep(1000);
	        Reporter.log("taking a screenshot when TC are pass", true);
		}
		
	    public static void Scrolling(WebDriver driver,WebElement element)
	    {
	    	JavascriptExecutor js = ((JavascriptExecutor)driver);
	    	js.executeScript("arguments[0],srollIntoview(true)",element);
	    	Reporter.log("Scrollig ito view ",true);
	    }
	
}
