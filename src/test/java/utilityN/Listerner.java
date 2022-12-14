package utilityN;

import java.io.IOException;


import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import baseN.BaseNeostoxnew;
import neoPOM.UtilityNew;



public class Listerner extends BaseNeostoxnew implements ITestListener
 {	
		public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC is completly success", true);
	}
		//iosterner is very importantat
		
	public void onTestFailure(ITestResult result) 
	{
		 result.getName();
		Reporter.log("test case "+result.getName()+"fail", true);
		
			try {
				UtilityNew.TakeScreenshot(driver, result.getName() );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
}
		
	
	public void onTestSkipped(ITestResult result)
	{
	
		Reporter.log("TC is skipping", true);
	}
	
	
	}

	


