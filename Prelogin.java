package Action;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import casilandoproject.Tejasbase;
import pages.Config;
public class Prelogin extends Tejasbase {

	@Test
    public  void UserLogin()throws Throwable {
		Tejasbase.invoke();
		test = report.startTest("Pre Login");
			
		Thread.sleep(3000);
		//Home Menu 
		try { 
		driver.findElement(Config.home).click();
		System.out.println("Home menu Redirect successfully ");
			test.log(LogStatus.PASS, "Home menu succesfully redirect", "To open Screenshots : <a href=' "
                 + Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		} catch (Exception f10) {
			System.out.println("Home menu successfully Failed");
			f10.getMessage();
			test.log(LogStatus.FAIL, "Home menu FAILED ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		}        
		Thread.sleep(3000);
		// livecasino Menu 
				try { 
				driver.findElement(Config.livecasino).click();
				System.out.println("Live casino menu  redirect  Success");
					test.log(LogStatus.PASS, "livecasino menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("livecasino menu successfully   Failed");
                    
					f10.getMessage();
					test.log(LogStatus.FAIL, "livecasino menu   FAILED ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}	
				
				
			/*	Thread.sleep(3000);
				// livecasino game  Menu 
						try {
						driver.findElement(Config.livecasinogame).click();
						Thread.sleep(3000);
						driver.findElement(Config.loginicon).click();
						Thread.sleep(3000);
						driver.findElement(Config.loginiconclose).click();
						System.out.println("Live casino  game menu  redirect  Success");
							test.log(LogStatus.PASS, "livecasino menu succesfully redirect", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
						} catch (Exception f10) {
							System.out.println("livecasino  game  menu successfully   Failed");

							f10.getMessage();
							test.log(LogStatus.FAIL, "livecasino menu   FAILED ", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
						}	*/
				
				Thread.sleep(3000);
				// Casino  Menu 
				try {
				driver.findElement(Config.casino).click();
				System.out.println("Casino menu  redirect successfully");
					test.log(LogStatus.PASS, "casino menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("casino menu successfully   Failed");

					f10.getMessage();
					test.log(LogStatus.FAIL, "casino menu  FAILED ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}	
				Thread.sleep(3000);
				// Promotions  Menu 
				try {
				driver.findElement(Config.promotions).click();
				System.out.println("promotions menu redirect  successfully");
					test.log(LogStatus.PASS, "promotions menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("promotions menu successfully   Failed");

					f10.getMessage();
					test.log(LogStatus.FAIL, "promotions menu FAILED ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}	
				Thread.sleep(3000);
				// Aboutus  Menu 
				try {
				driver.findElement(Config.Aboutus).click();
				System.out.println("Aboutus menu redirect  successfully  ");
					test.log(LogStatus.PASS, "Aboutus menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Aboutus menu successfully  Failed");

					f10.getMessage();
					test.log(LogStatus.FAIL, "Aboutus menu  FAILED ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}	
				Thread.sleep(3000);
				// Paymentmethod  Menu 
				try {
				driver.findElement(Config.Paymentmethod).click();
				System.out.println("Paymentmethod menu redirect  successfully  ");
					test.log(LogStatus.PASS, "Paymentmethod menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Paymentmethod menu successfully  Failed");
					f10.getMessage();
					test.log(LogStatus.FAIL, "Paymentmethod menu  FAILED ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}		
				Thread.sleep(5000);
				// Privacypolicy  Menu 
				try {
				driver.findElement(Config.Privacypolicy).click();
				System.out.println("Privacypolicy menu redirect  successfully  ");
					test.log(LogStatus.PASS, "Privacypolicy menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Privacypolicy menu successfully  Failed");
					f10.getMessage();
					test.log(LogStatus.FAIL, "Privacypolicy menu  FAILED ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}
				

				
				Thread.sleep(3000);
				// Responsibegaming  Menu 
				try {
					driver.findElement(Config.Cookiess).click();
					Thread.sleep(2000);
				driver.findElement(Config.Responsibegaming).click();
				System.out.println("Responsibegaming menu redirect  successfully  ");
					test.log(LogStatus.PASS, "Responsibegaming menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Responsibegaming menu successfully  Failed");
					f10.getMessage();
					test.log(LogStatus.FAIL, "Responsibegaming menu  FAILED ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}		
				Thread.sleep(3000);
				// Terms  Menu 
				try {
				driver.findElement(Config.Terms).click();
				System.out.println("Terms menu redirect  successfully  ");
					test.log(LogStatus.PASS, "Terms menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Terms menu successfully  Failed");
					f10.getMessage();
					test.log(LogStatus.FAIL, "Terms menu  FAILED ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}		
				Thread.sleep(2000);
				// Contactus  Menu 
				try {
				driver.findElement(Config.Contactus).click();
				System.out.println("Contactus menu redirect  successfully  ");
					test.log(LogStatus.PASS, "Contactus menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Contactus menu successfully  Failed");
					f10.getMessage();
					test.log(LogStatus.FAIL, "Contactus menu  FAILED ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}
				
				
				//Footer menu  
				// Aboutus1  Menu 
				Thread.sleep(5000);
				try {
				driver.findElement(Config.Aboutus1).click();
				System.out.println("Aboutus1 menu redirect  successfully  ");
					test.log(LogStatus.PASS, "Aboutus1 menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Aboutus1 menu successfully  Failed");

					f10.getMessage();
					test.log(LogStatus.FAIL, "Aboutus1 menu  FAILED ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}	
				
				
			/*	Thread.sleep(2000);
				// Paymentmethod1  Menu 
				try {
				driver.findElement(Config.Paymentmethod1).click();
				System.out.println("Paymentmethod1 menu redirect  successfully  ");
					test.log(LogStatus.PASS, "Paymentmethod1 menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Paymentmethod1 menu successfully  Failed");
					f10.getMessage();
					test.log(LogStatus.FAIL, "Paymentmethod1 menu  FAILED ", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}		
				Thread.sleep(2000);
				// Contactus  Menu 
				try {
				driver.findElement(Config.Contactus1).click();
				System.out.println("Contactus1 menu redirect  successfully  ");
					test.log(LogStatus.PASS, "Contactus1 menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Contactus1 menu successfully  Failed");
					f10.getMessage();
					test.log(LogStatus.FAIL, "Contactus1 menu  FAILED ", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}
				Thread.sleep(2000);
				// Privacypolicy1  Menu 
				try {
				driver.findElement(Config.Privacypolicy1).click();
				System.out.println("Privacypolicy1 menu redirect  successfully  ");
					test.log(LogStatus.PASS, "Privacypolicy1 menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Privacypolicy1 menu successfully  Failed");
					f10.getMessage();
					test.log(LogStatus.FAIL, "Privacypolicy1 menu  FAILED ", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}
				Thread.sleep(2000);
				// Kycpolicy  Menu 
				try {
				driver.findElement(Config.Kycpolicy).click();
				System.out.println("Kycpolicy menu redirect  successfully  ");
					test.log(LogStatus.PASS, "Kycpolicy menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Kycpolicy menu successfully  Failed");
					f10.getMessage();
					test.log(LogStatus.FAIL, "Kycpolicy menu  FAILED ", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}
				Thread.sleep(2000);
				// Responsibe1  Menu 
				try {
				driver.findElement(Config.Responsibe1).click();
				System.out.println("Responsibe1 menu redirect  successfully  ");
					test.log(LogStatus.PASS, "Responsibe1 menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Responsibe1 menu successfully  Failed");
					f10.getMessage();
					test.log(LogStatus.FAIL, "Responsibe1 menu  FAILED ", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}
				Thread.sleep(2000);
				// Terms1  Menu 
				try {
				driver.findElement(Config.Terms1).click();
				System.out.println("Terms1 menu redirect  successfully  ");
					test.log(LogStatus.PASS, "Terms1 menu succesfully redirect", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				} catch (Exception f10) {
					System.out.println("Terms1 menu successfully  Failed");
					f10.getMessage();
					test.log(LogStatus.FAIL, "Terms1 menu  FAILED ", "To open Screenshots : <a href=' "
							+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}*/

	}}

	
	

