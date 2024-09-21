package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.EditAccountPageTN;
import pageObjects.HomePageTN;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC003_EditAccountTest extends BaseClass {

	@Test
	public void verify_EditAccount() throws InterruptedException {
		
		HomePageTN hp = new HomePageTN(driver);
        hp.clickMyAccount();
        hp.clickLogin();
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail("rajansingh12@yopmail.com");
		lp.setPassword("Test@12345");
		lp.clickLogin();
	    Thread.sleep(5000);
	     
		EditAccountPageTN ea = new EditAccountPageTN(driver);
		ea.clickeditaccount();
	    ea.setFirstName("Tapas");
	    ea.setLastName("Mishra");
	    ea.setEmail("Tapan34@yopmail.com");
	    ea.setTelephone("1234567");
	    ea.clickContinue();
	    boolean result = ea.isSuccessMessageDisplayed();
        Assert.assertTrue(result, "The account was not updated successfully.");
	
	
	
	
	
	}
	
	
	
	
	
	
	
}
