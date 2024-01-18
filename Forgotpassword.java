package Action;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import pages.Config;
import casilandoproject.Tejasbase;

public class Forgotpassword extends Tejasbase {

	@Test
    public  void UserLogin()throws Throwable {
		Tejasbase.invoke();
		test = report.startTest("forgot password");
		Thread.sleep(1000);
		driver.findElement(Config.loginicon).click();
		System.out.println("Login button clicked !!");
	
		
		
		Thread.sleep(3000);
	//Forgot password popup
	try {
		
		driver.findElement(Config.forgot).click();
		System.out.println("Forgot password redirected success!!");
		Thread.sleep(1500);
		test.log(LogStatus.PASS, "Forgot passwored redirect  success ", "To open Screenshots : <a href=' "
				+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
	} catch (Exception f10) {
		System.out.println("Forgot password redirect  Failed ");
				f10.getMessage();
		test.log(LogStatus.FAIL, "Forgot Password  redirect  Failed  ", "To open Screenshots : <a href=' "
				+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	
	}
	

	//Forgot password  input field empty  
	try {
		
		driver.findElement(Config.forgotsubmit).click();
		test.log(LogStatus.PASS, "Mobile &  email  empty verified success ", "To open Screenshots : <a href=' "
				+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
	} catch (Exception f10) {
		f10.getMessage();
		test.log(LogStatus.FAIL, "Mobile &  email  empty Failed ", "To open Screenshots : <a href=' "
				+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	
	}	
	// Invalid Mobile no 
			try {

				WebElement forgot = driver.findElement(Config.forgotinpufiled);
				forgot.sendKeys("8056594182");
				System.out.println("Entered Invalid mobileno !!");
				driver.findElement(Config.forgotsubmit).click();
				Thread.sleep(2000);
			     forgot.clear();			
				test.log(LogStatus.PASS, "Invalid mobile no verified ", "To open Screenshots : <a href=' "
						+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
			} catch (Exception f10) {
				System.out.println("Invalid mobile no verified");

				f10.getMessage();
				test.log(LogStatus.FAIL, "Invalid mobile no  Failed ", "To open Screenshots : <a href=' "
						+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
			}
			// Valid Mobile no 
						try {
							WebElement forgot = driver.findElement(Config.forgotinpufiled);
							forgot.sendKeys("8056059418");
							System.out.println("Entered valid mobileno !!");
							driver.findElement(Config.forgotsubmit).click();
							Thread.sleep(2000);
							test.log(LogStatus.PASS, "valid mobile no ", "To open Screenshots : <a href=' "
									+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
							forgot.clear();
						} catch (Exception f10) {
							
							f10.getMessage();
							test.log(LogStatus.FAIL, "valid  mobile no   Failed ", "To open Screenshots : <a href=' "
									+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");													
						}						
				// Valid Email id 
						try {
							WebElement forgot = driver.findElement(Config.forgotinpufiled);
							forgot.sendKeys("Sarath.janarthanan@digient.in");
							System.out.println("Entered valid Email id!!");
							driver.findElement(Config.forgotsubmit).click();
							Thread.sleep(2000);
							test.log(LogStatus.PASS, "valid Email id success ", "To open Screenshots : <a href=' "
									+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
						} catch (Exception f10) {						
							f10.getMessage();
							test.log(LogStatus.FAIL, "valid email id   Failed ", "To open Screenshots : <a href=' "
									+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
						}	
						
							
	}}

	

