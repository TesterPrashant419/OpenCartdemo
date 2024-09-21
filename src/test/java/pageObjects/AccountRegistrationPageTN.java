package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPageTN extends BasePage { 
public AccountRegistrationPageTN(WebDriver driver) {
		super(driver);
		
	}
    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstNameTN;

    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastNameTN;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailTN;

    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement telephoneTN;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement passwordTN;

    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement confirmPasswordTN;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement privacyTN;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButtonTN;

    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement msgConfirmationTN;

    public void setFirstName(String firstNameText) {
        firstNameTN.sendKeys(firstNameText);
    }

    public void setLastName(String lastNameText) {
        lastNameTN.sendKeys(lastNameText);
    }

    public void setEmail(String emailText) {
        emailTN.sendKeys(emailText);
    }

    public void setTelephone(String telephoneText) {
        telephoneTN.sendKeys(telephoneText);
    }

    public void setPassword(String passwordText) {
        passwordTN.sendKeys(passwordText);
    }

    public void setConfirmPassword(String confirmPasswordText) {
        confirmPasswordTN.sendKeys(confirmPasswordText);
    }

    public void agreeToPrivacyPolicy() {
        privacyTN.click();
    }

    public void clickContinue() {
        continueButtonTN.click();
    }

    public boolean isConfirmationMessageDisplayed() {
        return msgConfirmationTN.isDisplayed();
    }
}
