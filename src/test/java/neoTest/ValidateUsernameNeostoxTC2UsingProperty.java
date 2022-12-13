package neoTest;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseN.BaseNeostoxnew;
import neoPOM.Homepage;
import neoPOM.Neostoxsignloginn;
import neoPOM.Passwordfield;
import neoPOM.UtilityNew;
@Listeners(utilityN.Listerner.class)
public class ValidateUsernameNeostoxTC2UsingProperty extends BaseNeostoxnew{
      Neostoxsignloginn login;
      Passwordfield password;
      Homepage home;
      
	@BeforeClass
	  public void LaunnchUrl() throws InterruptedException
	  	{
		Launchneostox();
		login=new Neostoxsignloginn(driver);
		password=new Passwordfield(driver);
		home=new Homepage(driver);
			
	  }
	 @BeforeMethod
	  public void signloginpage() throws InterruptedException, IOException
	  {
			
			login.sendmobileNumber(driver,UtilityNew.ReadDatafromPropertiesFile("number"));		
			Thread.sleep(1000);
			login.clickOnsignInButton(driver);
			Thread.sleep(1000);
			password.sendpassword(driver,UtilityNew.ReadDatafromPropertiesFile("password"));
			Reporter.log("exaldata reading password", true);
			password.sumitbutton(driver);
			Thread.sleep(500);
			home.popuphandle(driver);
	  }

     @Test
    public void validateusename() throws IOException, InterruptedException
    {
    	 Assert.assertEquals(home.getusername(),UtilityNew.ReadDatafromPropertiesFile("username"),"expected and actual not matching TC is fail");
    		//UtilityNew.TakeScreenshot(driver,home.getusername());
    	Reporter.log("TC username  pass", true);
    	
      }
    @Test
     public void balance() throws EncryptedDocumentException, IOException, InterruptedException
     {
    	Assert.assertEquals(home.getbalance(driver),UtilityNew.ReadDatafromPropertiesFile("balance"),"actual and expected result are not matching TC are fail");
    	//neoPOM.UtilityNew.TakeScreenshot(driver,home.getbalance(driver));
    	Reporter.log("TC balance  pass", true);
   }
 
  @AfterMethod 
  public void enterlogout()
  {
	   home.logoutapp(driver);
	 
  } 

@AfterClass
  public void closeapp() throws InterruptedException
  {
	  closingBrowser(driver);
  }

}
