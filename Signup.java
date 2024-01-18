package Action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

import casilandoproject.Tejasbase;
import pages.Config;



public class Signup extends Tejasbase {
    
	@Test
    public  void UserLogin()throws Throwable { 
		Tejasbase.invoke();
		
		test = report.startTest("Signup");
		Thread.sleep(1000);
		driver.findElement(Config.Signup).click();
		System.out.println("signup icon button clicked !!");

		Thread.sleep(2000);
		// Username & Password Empty
		try {

			driver.findElement(Config.Signupbutton).click();
			System.out.println("Signup form all details empty verified!!");
			Thread.sleep(1500);
			test.log(LogStatus.PASS, "Signup form all details  empty verified", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\>Click Here</a>");
		} catch (Exception f10) {
			System.out.println("Signup form all details empty Failed");
			;
			f10.getMessage();
			test.log(LogStatus.FAIL, "Signup form all details Failed", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\>Click Here</a>");
		}
	Thread.sleep(2000);
		// Invalid Username,Email  & Password
		try {
			WebElement username = driver.findElement(Config.signupusername);
			username.sendKeys("Cas#$#@!&*");
			System.out.println("Entered Invalid Username!!");
			
			WebElement Email = driver.findElement(Config.signupemail);
			Thread.sleep(4000);
			Email.sendKeys("test@12345");
			System.out.println(" Entered Invalid email!!");		
			WebElement password = driver.findElement(Config.signuppassword); 
			Thread.sleep(4000);
			password.sendKeys("test@12345");
			System.out.println(" Entered Invalid Password!!");
			driver.findElement(Config.Signupbutton).click();
			System.out.println("Invalid Username,Email  & Password Verified!!");
			Thread.sleep(2000);
			

			test.log(LogStatus.PASS, "Invalid username,Email & password success ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
			username.clear();
			password.clear();
			Email.clear();
			Thread.sleep(5000);
		} catch (Exception f10) {
			System.out.println("Invalid Username  & Password  failed ");

			f10.getMessage();
			test.log(LogStatus.FAIL, "Invalid username, Email  and password Failed ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		}
		
		Thread.sleep(2000);
		// Less than 3  Email, Username & Password
		try {
			WebElement username = driver.findElement(Config.signupusername);
			username.sendKeys("tes");
			System.out.println("Entered Username least 6 characters !!");
			
			WebElement Email = driver.findElement(Config.signupemail);
			Thread.sleep(4000);
			Email.sendKeys("te");
			System.out.println("Entered Email least 6 characters !!");		
			WebElement password = driver.findElement(Config.signuppassword);
			Thread.sleep(4000);
			password.sendKeys("te");
			System.out.println("Entered  Password least 6 characters!!");
			driver.findElement(Config.Signupbutton).click();
			System.out.println(" Username,Email  & Password least 6 characters  Verified!!");
			Thread.sleep(2000);
			test.log(LogStatus.PASS, "Username,Email & password least 6 characters success ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
			username.clear();
			password.clear();
			Email.clear();
			Thread.sleep(5000);
			
		} catch (Exception f10) {
			System.out.println("Username,Email  & Password least 6 characters   failed ");

			f10.getMessage();
			test.log(LogStatus.FAIL, "Username, Email  and password least 6 characters Failed ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		}
		
	/*	Thread.sleep(2000);
		// Terms & Conditions
		try {

			driver.findElement(Config.TermsConditions).click();
			System.out.println("TermsConditions redirect  successfully!!");
			Thread.sleep(1500);
			test.log(LogStatus.PASS, "TermsConditions redirect  successfully!!", "To open Screenshots : <a href=' "
					+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\>Click Here</a>");
		} catch (Exception f10) {
			System.out.println("TermsConditions redirect Failed");
			;
			f10.getMessage();
			test.log(LogStatus.FAIL, "TermsConditions redirect Failed", "To open Screenshots : <a href=' "
					+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\>Click Here</a>");
		}*/
		Thread.sleep(2000);
		// Valid  signup credentails
		try {
			WebElement username = driver.findElement(Config.signupusername);
			username.sendKeys("sigmaruless");
			System.out.println("Entered valid  Username!!");
			
			Thread.sleep(2000);
			WebElement signupcode = driver.findElement(Config.signupcode);
			Thread.sleep(4000);
			signupcode.sendKeys("+91");
			System.out.println(" selected  Mobileno code !!");
			
			Thread.sleep(2000);
			WebElement mobile = driver.findElement(Config.signupmobile);
			Thread.sleep(4000);
			mobile.sendKeys("8012047331");
			System.out.println(" Entered Valid  Mobileno!!");
			
			Thread.sleep(2000);
	        WebElement dropdown = driver.findElement(Config.Country);	     
	        Thread.sleep(4000);
	        dropdown.sendKeys("India");
	        System.out.println("Selected  country code!!");
	        
	        Thread.sleep(2000);
	        WebElement State = driver.findElement(Config.State);	     
	        Thread.sleep(4000);
	        State.sendKeys("Tamil Nadu");
	        System.out.println("Selected  State !!");
	        
	        
	        Thread.sleep(2000);
	        WebElement currency = driver.findElement(Config.Currency);	     
	        Thread.sleep(4000);
	        currency.sendKeys("INR (₹)");
	        System.out.println("Selected  currency !!");
			
	        Thread.sleep(2000);
			WebElement Email = driver.findElement(Config.signupemail);
			Thread.sleep(4000);
			Email.sendKeys("sarathss.janarthanan@digient.in");
			System.out.println(" Entered Valid exist email!!");	
					
			Thread.sleep(2000);
			WebElement password = driver.findElement(Config.signuppassword);
			Thread.sleep(4000);
			password.sendKeys("Test@123");
			System.out.println("Entered  valid  Password!!");
    		test.log(LogStatus.PASS, "Signup all crendentails valid  success ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		} catch (Exception f10) {
			System.out.println("Signup all crendentails valid failed ");

			f10.getMessage();
			test.log(LogStatus.FAIL, "Signup all crendentails valid Failed ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		}
			
		// Remember me &  Signup  success
				try {
						driver.findElement(Config.eyeicon1).click();	
					Thread.sleep(2000);	
					driver.findElement(Config.Ageconfrms).click();	
					Thread.sleep(2000);
					driver.findElement(Config.TermsConditions).click();	
					Thread.sleep(2000);
					
					driver.findElement(Config.Signupbutton).click();
					System.out.println("Signup successfully!!");
					Thread.sleep(1500);

					test.log(LogStatus.PASS, " Signup  success ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Signup successfully  Failed");
                    
					f10.getMessage();
					test.log(LogStatus.FAIL, "Signup  successfuly FAILED ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}	

	}
}