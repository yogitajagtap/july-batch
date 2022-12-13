package neoPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class Passwordfield 
{
	@FindBy(id="txt_accesspin")private WebElement passwordkey;
	
	@FindBy(xpath="(//a[text()='Submit'])[1]") private WebElement submit;

	public Passwordfield(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendpassword(WebDriver driver,String pass)
	{
		UtilityNew.Wait(driver, 1000);
		passwordkey.sendKeys(pass);
		Reporter.log("send password", true);
	}
	public void sumitbutton(WebDriver driver)
	{
		UtilityNew.Wait(driver, 1000);
		submit.click();
	}
}
