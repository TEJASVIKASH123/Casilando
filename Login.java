package Action;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.Config;
import casilandoproject.Tejasbase;

public class Login extends Tejasbase{

	@Test
    public  void UserLogin()throws Throwable {
		Tejasbase.invoke();
		test = report.startTest("Login");
		Thread.sleep(1000);
		driver.findElement(Config.loginicon).click();
		System.out.println("Login button clicked !!");

		Thread.sleep(2000);
		// Username & Password Empty
		try {

			driver.findElement(Config.Loginbutton).click();
			System.out.println("username and password  empty verified!!");
			Thread.sleep(1500);
			test.log(LogStatus.PASS, "username and password  empty verified", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\>Click Here</a>");
		} catch (Exception f10) {
			System.out.println("username and password  empty Failed");
			;
			f10.getMessage();
			test.log(LogStatus.FAIL, "username and password  Failed", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\>Click Here</a>");
		}
		Thread.sleep(2000);
		// Invalid Username & Password
		try {
			WebElement username = driver.findElement(Config.username);
			username.sendKeys("iptejassss");
			System.out.println("Entered Invalid Username!!");
			WebElement password = driver.findElement(Config.password);
			Thread.sleep(4000);
			password.sendKeys("test@12345");
			System.out.println(" Entered Invalid Password!!");
			driver.findElement(Config.Loginbutton).click();
			System.out.println("Invalid Username  & Password Verified!!");
			Thread.sleep(2000);
			username.clear();
			password.clear();
			Thread.sleep(5000);

			test.log(LogStatus.PASS, "Invalid username and password  ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		} catch (Exception f10) {
			System.out.println("Invalid Username  & Password  failed ");

			f10.getMessage();
			test.log(LogStatus.FAIL, "Invalid username and password Failed ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		}
		Thread.sleep(2000);
		// Blocked user
		try {
			WebElement username = driver.findElement(Config.username);
			username.sendKeys("pavan");
			System.out.println("blocked Username entered !!");
			WebElement password = driver.findElement(Config.password);
			Thread.sleep(2000);
			password.sendKeys("Test@123");
			System.out.println("blocked userPassword Entered !!");
			driver.findElement(Config.Loginbutton).click();
			System.out.println("blocked user verified ");
			Thread.sleep(2000);

			test.log(LogStatus.PASS, "Blocked user ", "To open Screenshots : <a href=' " + Tejasbase.takeSnapShot()
					+ " ' target=\\\"_blank\\  >Click Here</a>");
			username.clear();
			password.clear();
			Thread.sleep(5000);

		} catch (Exception f10) {
			System.out.println("blocked user failed ");

			f10.getMessage();
			test.log(LogStatus.FAIL, "Blocked user failed", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		}
		Thread.sleep(2000);
		// valid credentails
		try {
			WebElement username = driver.findElement(Config.username);
			username.sendKeys("Expired");
			System.out.println(" Username entered !!");
			WebElement password = driver.findElement(Config.password);
			Thread.sleep(2000);
			password.sendKeys("Test@1234");
			System.out.println("Password Entered!!");
			Thread.sleep(2000);
			driver.findElement(Config.eyeicon).click();	
			Thread.sleep(1500);

			test.log(LogStatus.PASS, "Valid username and password  ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		} catch (Exception f10) {
			System.out.println("Valid username and password  Failed");

			f10.getMessage();
			test.log(LogStatus.FAIL, "Valid username and password  FAILED ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		}
		
		
		// Remember me &  Login success
				try {
					driver.findElement(Config.rememberme).click();					
					driver.findElement(Config.Loginbutton).click();
					System.out.println("Login successfully!!");
					Thread.sleep(1500);

					test.log(LogStatus.PASS, " login success ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Login successfully  Failed");

					f10.getMessage();
					test.log(LogStatus.FAIL, "Login  successfuly FAILED ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}

	}
}

	

