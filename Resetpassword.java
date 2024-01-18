package Action;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.Config;
import com.relevantcodes.extentreports.LogStatus;

import casilandoproject.Tejasbase;

public class Resetpassword extends Tejasbase {

	@Test
    public  void UserLogin()throws Throwable {
		Tejasbase.invoke();
		test = report.startTest("reset password");
		
		
		Thread.sleep(1000);
		//Reset password  input field empty  
		try {
			
			driver.findElement(Config.Resetsubmit).click();
			test.log(LogStatus.PASS, " Reset password empty verified success ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		} catch (Exception f10) {
			f10.getMessage();
			test.log(LogStatus.FAIL, "Reset password   empty Failed ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	
		}	
		
		//New &  confirm password   does not match 
		try {
			WebElement resetnew = driver.findElement(Config.NewPassword);
			resetnew.sendKeys("Test@123");
			Thread.sleep(2000);
			WebElement Confirm = driver.findElement(Config.Confirmpassword);
			Confirm.sendKeys("Test@1234");
			Thread.sleep(2000);
			driver.findElement(Config.Resetsubmit).click();
			System.out.println("New &  confirm password   does not match  success!!");
			Thread.sleep(1500);
			test.log(LogStatus.PASS, "New &  confirm password   does not match   success ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		} catch (Exception f10) {
			System.out.println("New &  confirm password   does not match  ");
					f10.getMessage();
			test.log(LogStatus.FAIL, "New &  confirm password   does not match   Failed  ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
			}
		
		
		
					// Valid Reset password   
						try {
							WebElement resetnew = driver.findElement(Config.NewPassword);
							resetnew.sendKeys("Test@123");
							WebElement Confirm = driver.findElement(Config.Confirmpassword);
							Confirm.sendKeys("Test@123");
							Thread.sleep(2000);
							driver.findElement(Config.Resetsubmit).click();
							System.out.println("Reset password redirected success!!");
							Thread.sleep(1500);
							test.log(LogStatus.PASS, "reset passwored  success ", "To open Screenshots : <a href=' "
									+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
						} catch (Exception f10) {
							System.out.println("Rest password  Failed ");
									f10.getMessage();
							test.log(LogStatus.FAIL, "Reset Password   Failed  ", "To open Screenshots : <a href=' "
									+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
							}
							
							
	}}


