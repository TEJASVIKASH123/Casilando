package Action;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.Config;
import casilandoproject.Tejasbase;

public class Profile extends Tejasbase {

	
	@Test
    public  void UserLogin()throws Throwable {
		Tejasbase.invoke();
		test = report.startTest("Profile");
		Thread.sleep(1000);
		driver.findElement(Config.loginicon).click();
		System.out.println("Login button clicked !!");
		
		
		Thread.sleep(3000);
		// valid credentails
		try {
			WebElement username = driver.findElement(Config.username);
			username.sendKeys("Signup1000");
			System.out.println(" Username entered !!");
			WebElement password = driver.findElement(Config.password);
			Thread.sleep(2000);
			password.sendKeys("Test@1234");
			System.out.println("Password Entered!!");
			Thread.sleep(2000);
			driver.findElement(Config.eyeicon).click();	
			driver.findElement(Config.rememberme).click();					
			driver.findElement(Config.Loginbutton).click();
			Thread.sleep(1500);

			test.log(LogStatus.PASS, "Valid username and password  ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		} catch (Exception f10) {
			System.out.println("Valid username and password  Failed");

			f10.getMessage();
			test.log(LogStatus.FAIL, "Valid username and password  FAILED ", "To open Screenshots : <a href=' "
					+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		}
	
		     Thread.sleep(2000);
				  //Hamburger menu site &  My profile click  
		  	       try {	  	    
		  	    	 driver.findElement(Config.Myaccount).click(); 
		  	    	 System.out.println("Post Hamburger Menu clicked!!");
		  	    	driver.findElement(Config.Myprofile).click(); 	    			
		             System.out.println("Post My profile  Menu");
		    			Thread.sleep(1500);
						test.log(LogStatus.PASS, "My profile Verified", "To open Screenshots : <a href=' "
								+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	    			
		    			}
		    			catch(Exception f10) 
		    			{
		    				System.out.println(" MyProfile failed");
		    				f10.getMessage();
		    				test.log(LogStatus.PASS, "My profile Verified", "To open Screenshots : <a href=' "
									+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");	    				
		    			}
		  	    Thread.sleep(2000);			    
		  	     //Profile empty    
		  	       try {	  	    
		  	    	 driver.findElement(Config.Profilesubmit).click(); 
		  	    	 System.out.println("Profile empty  clicked!!");	  	    	     	        
		             test.log(LogStatus.PASS, "Profile empty  clicked", "To open Screenshots : <a href=' "	+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		    			}
		    			catch(Exception f10)
		    			{
		    				System.out.println("Profile empty failed");
		    						    				
		    				f10.getMessage();
		    				test.log(LogStatus.FAIL, "Profile empty  Failed ","To open Screenshots : <a href=' "
									+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
		    			}
		  	       
		  	     Thread.sleep(2000);
		 		// Less than 3  First, Last & city 
		 		try {
		 			WebElement Firstnames = driver.findElement(Config.firstname);
		 			Firstnames.sendKeys("ts");
		 			System.out.println("Entered firstname least 3 characters !!");
		 			
		 			WebElement lastnames = driver.findElement(Config.lastname);
		 			Thread.sleep(4000);
		 			lastnames.sendKeys("te");
		 			System.out.println("Entered lastname least 3 characters !!");	
		 			
		 			WebElement citys = driver.findElement(Config.city);
		 			Thread.sleep(4000);
		 			citys.sendKeys("chennai");
		 			citys.click();
		 	
		 			Thread.sleep(5000);
		 			driver.findElement(Config.city1).click();


		 			Thread.sleep(3000);
		 			
				} catch (Exception f10) {
					System.out.println("firstname,Lastname  & city least 3 characters   failed ");

					f10.getMessage();
					test.log(LogStatus.FAIL, "firstname,Lastname  & city least 3 characters  Failed ", "To open Screenshots : <a href=' "
							+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				}
				
				Thread.sleep(2000);	
			  	     //  address
				  	   try {	 
				  		   
				 			WebElement address = driver.findElement(Config.address);
				 			Thread.sleep(4000);
				 			address.sendKeys("No:1/2 OR  Guindy  estate,chennai -99 ");
				 			
				  	    	 System.out.println("Enter the address Details !!");
				  	    	test.log(LogStatus.PASS, "Enter the address details  ","To open Screenshots : <a href=' "
									+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				    			}
				    			catch(Exception f10)
				    			{
				    				System.out.println("address  Failed");
				    				f10.getMessage();
				    				test.log(LogStatus.FAIL, "address failed ","To open Screenshots : <a href=' "
				    						+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				    			} 	
				  	Thread.sleep(2000);	
				  	  //Gender 
				  	    try {	  	      	    
				  	    	WebElement gender = driver.findElement(Config.gender);
				 			Thread.sleep(4000);
				 			gender.sendKeys("Male");
				 			gender.click();
				 			
				  	    	 System.out.println("Selected the Gender Details !!");
					            test.log(LogStatus.PASS, "  Gender  Verified ","To open Screenshots : <a href=' "
										+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println("Gender  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "Gender  FAILEd ","To open Screenshots : <a href=' "
											+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				  	     	}
				  	  Thread.sleep(2000);	
				  	  // DOB 
				  	    try {	  	      	    
				  	    	  ///   driver.findElement(Config.DOB).click();  	    	
					           // 
					            
					            WebElement DOBS = driver.findElement(Config.DOB);
					            System.out.println(" DOB  Selected  successfully!!");
					 			Thread.sleep(4000);
					 			DOBS.sendKeys("17-11-2005");
					 			Thread.sleep(5000);
					 			DOBS.click();
					 			Thread.sleep(4000);
					 			
					 			driver.findElement(Config.Profilesubmits);
					            System.out.println("profile updated  successfully!!");
					            
					            test.log(LogStatus.PASS, "DOB  Selected  successfully"," open Screenshots : <a href=' "
										+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println("DOB  Selected  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "DOB  Selected FAILEd ","To open Screenshots : <a href=' "
											+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
						            
						            
				  	     	}
				  	/*  Thread.sleep(2000);	
				  	  //Withdraw Menu 
				  	    try {	  	      	    
				  	    	     driver.findElement(Config.Withdraw).click();  	    	
					            System.out.println("Withdraw menu    Verified !!");
					            test.log(LogStatus.PASS, " Withdraw menu Verified ","To open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println(" Withdraw Menu  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "Withdraw menu  FAILEd ","To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				  	     	}
				  	  Thread.sleep(2000);	
				  	//Bonus Menu 
				  	    try {	  	      	    
				  	    	     driver.findElement(Config.Bonus).click();  	    	
					            System.out.println("Bonus menu    Verified !!");
					            test.log(LogStatus.PASS, " Bonus menu Verified ","To open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println(" Bonus Menu  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "Bonus menu  FAILEd ","To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				  	     	}
				  	  Thread.sleep(2000); 
				  	//FreeSpin Menu 
				  	    try {	  	      	    
				  	    	     driver.findElement(Config.FreeSpin).click();  	    	
					            System.out.println("Free Spin menu    Verified !!");
					            test.log(LogStatus.PASS, " Free Spin menu Verified ","To open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println(" Free Spin Menu  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "Free Spin menu  FAILEd ","To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				  	     	}
				  	  Thread.sleep(2000);
					  	//UnclaimedBonus Menu 
				  	    try {	  	      	    
				  	    	     driver.findElement(Config.UnclaimedBonus).click();  	    	
					            System.out.println("UnclaimedBonus menu    Verified !!");
					            test.log(LogStatus.PASS, "UnclaimedBonus menu Verified ","To open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println(" UnclaimedBonus  Menu  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "UnclaimedBonus menu  FAILEd ","To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				  	     	}
				  	  Thread.sleep(2000);
					  	//ConsumedBonus Menu 
				  	    try {	  	      	    
				  	    	     driver.findElement(Config.ConsumedBonus).click();  	    	
					            System.out.println("ConsumedBonus menu    Verified !!");
					            test.log(LogStatus.PASS, "ConsumedBonus menu Verified ","To open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println("ConsumedBonus Menu  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "ConsumedBonus menu  FAILEd ","To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				  	     	}
			  	  Thread.sleep(2000);	
				  	//Transaction Menu 
				  	    try {	  	      	    
				  	    	     driver.findElement(Config.transcation).click();  	    	
					            System.out.println("Transaction menu    Verified !!");
					            test.log(LogStatus.PASS, " Transaction menu Verified ","To open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println(" Transaction Menu  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "Transaction menu  FAILEd ","To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				  	     	}
				  	  Thread.sleep(2000);	
				  	//Alltranscation Menu 
				  	    try {	  	      	    
				  	    	     driver.findElement(Config.Alltranscation).click();  	    	
					            System.out.println("Alltranscation menu    Verified !!");
					            test.log(LogStatus.PASS, " Alltranscation menu Verified ","To open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println(" Alltranscation Menu  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "Alltranscation menu  FAILEd ","To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				  	     	}
				  	  
				  	  Thread.sleep(2000);	
				  	//DepositSummary Menu 
				  	    try {	  	      	    
				  	    	     driver.findElement(Config.DepositSummary).click();  	    	
					            System.out.println("DepositSummary menu    Verified !!");
					            test.log(LogStatus.PASS, " DepositSummary menu Verified ","To open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println(" DepositSummary Menu  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "DepositSummary menu  FAILEd ","To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				  	     	}
				  	  Thread.sleep(2000);	
				  	//WithdrawSummary Menu 
				  	    try {	  	      	    
				  	    	     driver.findElement(Config.WithdrawSummary).click();  	    	
					            System.out.println("WithdrawSummary menu    Verified !!");
					            test.log(LogStatus.PASS, " WithdrawSummary menu Verified ","To open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println(" WithdrawSummary Menu  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "WithdrawSummary menu  FAILEd ","To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				  	     	}
				  	  Thread.sleep(2000);	
				  	//GameHistory Menu 
				  	    try {	  	      	    
				  	    	     driver.findElement(Config.GameHistory).click();  	    	
					            System.out.println("GameHistory menu    Verified !!");
					            test.log(LogStatus.PASS, " GameHistory menu Verified ","To open Screenshots : <a href=' "
										+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
					    			}
					    			catch(Exception f10)  
					    			{
					    				System.out.println(" GameHistory Menu  failed");
				    				f10.getMessage();
						            test.log(LogStatus.FAIL, "GameHistory menu  FAILEd ","To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
				  	     	}
				  	    
				  	  Thread.sleep(3000);
						//Home Menu 
						try {
						driver.findElement(Config.Posthome).click();
						System.out.println("Home menu Redirect successfully ");
							test.log(LogStatus.PASS, "Home menu succesfully redirect", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
						} catch (Exception f10) {
							System.out.println("Home menu successfully Failed");
							f10.getMessage();
							test.log(LogStatus.FAIL, "Home menu FAILED ", "To open Screenshots : <a href=' "
									+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
						}
						Thread.sleep(3000);
						// livecasino Menu 
								try {
								driver.findElement(Config.Postlivecasino).click();
								System.out.println("Live casino menu  redirect  Success");
									test.log(LogStatus.PASS, "livecasino menu succesfully redirect", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								} catch (Exception f10) {
									System.out.println("livecasino menu successfully   Failed");

									f10.getMessage();
									test.log(LogStatus.FAIL, "livecasino menu   FAILED ", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								}	
	  	  
								Thread.sleep(3000);
								// Casino  Menu 
								try {
								driver.findElement(Config.Postcasino).click();
								System.out.println("Casino menu  redirect successfully");
									test.log(LogStatus.PASS, "casino menu succesfully redirect", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								} catch (Exception f10) {
									System.out.println("casino menu successfully   Failed");

									f10.getMessage();
									test.log(LogStatus.FAIL, "casino menu  FAILED ", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								}	
								Thread.sleep(3000);
								// Promotions  Menu 
								try {
								driver.findElement(Config.Postpromotions).click();
								System.out.println("promotions menu redirect  successfully");
									test.log(LogStatus.PASS, "promotions menu succesfully redirect", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								} catch (Exception f10) {
									System.out.println("promotions menu successfully   Failed");

									f10.getMessage();
									test.log(LogStatus.FAIL, "promotions menu FAILED ", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								}	
								
								
								Thread.sleep(3000);
								// Aboutus  Menu 
								try {
									driver.findElement(Config.Cookiess).click();
									Thread.sleep(2000);
								driver.findElement(Config.PostAboutus).click();
								System.out.println("Aboutus menu redirect  successfully  ");
									test.log(LogStatus.PASS, "Aboutus menu succesfully redirect", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								} catch (Exception f10) {
									System.out.println("Aboutus menu successfully  Failed");

									f10.getMessage();
									test.log(LogStatus.FAIL, "Aboutus menu  FAILED ", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								}	
								
								Thread.sleep(3000);
								// Paymentmethod  Menu 
								try {
								driver.findElement(Config.PostPaymentmethod).click();
								System.out.println("Paymentmethod menu redirect  successfully  ");
									test.log(LogStatus.PASS, "Paymentmethod menu succesfully redirect", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								} catch (Exception f10) {
									System.out.println("Paymentmethod menu successfully  Failed");
									f10.getMessage();
									test.log(LogStatus.FAIL, "Paymentmethod menu  FAILED ", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								}		
								Thread.sleep(3000);
								// Privacypolicy  Menu 
								try {
								driver.findElement(Config.PostPrivacypolicy).click();
								System.out.println("Privacypolicy menu redirect  successfully  ");
									test.log(LogStatus.PASS, "Privacypolicy menu succesfully redirect", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								} catch (Exception f10) {
									System.out.println("Privacypolicy menu successfully  Failed");
									f10.getMessage();
									test.log(LogStatus.FAIL, "Privacypolicy menu  FAILED ", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								}
								
								Thread.sleep(3000);
								// kyc  Menu 
								try {
									driver.findElement(Config.Postkyc).click();								
								System.out.println("kyc menu redirect  successfully  ");
									test.log(LogStatus.PASS, "kyc menu succesfully redirect", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								} catch (Exception f10) {
									System.out.println("kyc menu successfully  Failed");
									f10.getMessage();
									test.log(LogStatus.FAIL, "kyc menu  FAILED ", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								}		
							
								
								Thread.sleep(3000);
								// Responsibegaming  Menu 
								try {
									driver.findElement(Config.PostResponsibegaming).click();								
								System.out.println("Responsibegaming menu redirect  successfully  ");
									test.log(LogStatus.PASS, "Responsibegaming menu succesfully redirect", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								} catch (Exception f10) {
									System.out.println("Responsibegaming menu successfully  Failed");
									f10.getMessage();
									test.log(LogStatus.FAIL, "Responsibegaming menu  FAILED ", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								}		
								Thread.sleep(3000);
								// Terms  Menu 
								try {
								driver.findElement(Config.PostTerms).click();
								System.out.println("Terms menu redirect  successfully  ");
									test.log(LogStatus.PASS, "Terms menu succesfully redirect", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								} catch (Exception f10) {
									System.out.println("Terms menu successfully  Failed");
									f10.getMessage();
									test.log(LogStatus.FAIL, "Terms menu  FAILED ", "To open Screenshots : <a href=' "
											+ Baseclass.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								}	
								*/	
								Thread.sleep(3000);
								// Logout  button 
								try {
								driver.findElement(Config.Logout).click();
								System.out.println("Logout  popup shown  successfully  ");
									test.log(LogStatus.PASS, "Logout  popup shown  succesfully", "To open Screenshots : <a href=' "
											+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								} catch (Exception f10) {
									System.out.println("Logout  popup shown   Failed");
									f10.getMessage();
									test.log(LogStatus.FAIL, "Logout  popup shown   FAILED ", "To open Screenshots : <a href=' "
											+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								}	
								// Logout confirm  button 
								try {
								driver.findElement(Config.Logoutbutton).click();
								System.out.println("Logoutbutton  popup shown  successfully  ");
									test.log(LogStatus.PASS, "Logoutbutton  popup shown  succesfully", "To open Screenshots : <a href=' "
											+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								} catch (Exception f10) {
									System.out.println("Logoutbutton  popup shown   Failed");
									f10.getMessage();
									test.log(LogStatus.FAIL, "Logout  popup shown   FAILED ", "To open Screenshots : <a href=' "
											+ Tejasbase.takeSnapShot() + " ' target=\\\"_blank\\  >Click Here</a>");
								}		
								
}}

	  	   

			
				

