package neoPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class Neostoxsignloginn
{

	@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobilefieldButton;
	@FindBy(id="lnk_signup1") private WebElement signInButton;
	
	public Neostoxsignloginn(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendmobileNumber(WebDriver driver,String number)
	{
		UtilityNew.Wait(driver, 1000);
		mobilefieldButton.sendKeys(number);
		
		Reporter.log("send mobile nnumber", true);
	}
	public void clickOnsignInButton(WebDriver driver)
	{
		UtilityNew.Wait(driver, 1000);			
		signInButton.click();
		Reporter.log("click sign in button", true);
	}
	
	
}
