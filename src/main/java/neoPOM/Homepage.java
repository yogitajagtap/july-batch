package neoPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class Homepage
{
	@FindBy(id="lbl_username") private WebElement username;
	
    @FindBy(xpath="(//a[text()='OK'])[2]") private WebElement okbutton;
     @FindBy(xpath="(//a[text()='Close'])[5]")private WebElement closebutton;
     @FindBy(id="lbl_curbalancetop")private WebElement balance;
     @FindBy(xpath="//span[text()='Logout']") private WebElement logoutbutton;
     
    public Homepage(WebDriver driver)
{
   PageFactory.initElements(driver, this);
   }    
    public void popuphandle(WebDriver driver)
    {
    	if(okbutton.isDisplayed())
    	{
    		UtilityNew.Wait(driver, 500);
                     	okbutton.click();
    	
    	UtilityNew.Wait(driver, 500);
    	closebutton.click();    	
    //	Utilityneostox.Wait(driver, 1000);
    	Reporter.log("handlingpopup", true);
    	}
    	else {
    		Reporter.log("popup is not present", true);
    		}
    	}
public String getusername()
{	
	String actualusername = username.getText();
	
	Reporter.log("username text"+actualusername, true);
	return actualusername;
}
public String getbalance(WebDriver driver)
{
	UtilityNew.Wait(driver, 1000);
     String actualbalance = balance.getText();
 	UtilityNew.Wait(driver, 1000);
     Reporter.log("balance is "+actualbalance, true);
     return actualbalance;
     
}
	public  void logoutapp(WebDriver driver)
	{
		username.click();
		UtilityNew.Wait(driver, 1000);
	
		logoutbutton.click();
	Reporter.log("closing browser", true);
	}
}



