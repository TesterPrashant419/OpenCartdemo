package testCases;

import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPageTN;
import pageObjects.HomePageTN;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

    @Test
    public void verify_Account_Registration() {
        HomePageTN hp = new HomePageTN(driver);
        hp.clickMyAccount();
        hp.clickRegister();

        AccountRegistrationPageTN regpage = new AccountRegistrationPageTN(driver);
        regpage.setFirstName("Prashant");
        regpage.setLastName("Singh");
        regpage.setEmail(randomEmail());
        regpage.setTelephone("1234567890");

        String password = randomPassword();
        regpage.setPassword(password);
        regpage.setConfirmPassword(password);

        regpage.agreeToPrivacyPolicy();
        regpage.clickContinue();

        boolean isRegistered = regpage.isConfirmationMessageDisplayed();
        System.out.println(isRegistered ? "Your account has been created!" : "Account Registration Failed.");
    }

}