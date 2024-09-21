package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePageTN;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

    @Test
    public void verify_login() {
       HomePageTN hp = new HomePageTN(driver);
        hp.clickMyAccount();
        hp.clickLogin();

        
        LoginPage lp = new LoginPage(driver);
        lp.setEmail("Tapan1@yopmail.com");
        lp.setPassword("Test@12345");
        lp.clickLogin();

        MyAccountPage mcc = new MyAccountPage(driver);
        boolean targetpage= mcc.isMyAccountPageExists();
        Assert.assertEquals(targetpage, true, "Login failed");
    }
}
