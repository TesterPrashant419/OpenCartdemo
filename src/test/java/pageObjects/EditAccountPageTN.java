package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPageTN extends BasePage { 
    public EditAccountPageTN(WebDriver driver) {
        super(driver);
    }
    
    @FindBy (xpath ="//a[normalize-space()='Edit Account']")
    WebElement editaccount;
    
    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstNameTN;

    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastNameTN;

    @FindBy(xpath = "//input[@placeholder='E-Mail']")
    WebElement emailTN;

    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement telephoneTN;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButtonTN;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successMessageTN;
    
    public void clickeditaccount()
    {
    	editaccount.click();
    }

    // Set new first name
    public void setFirstName(String firstNameText) {
        firstNameTN.clear();
        firstNameTN.sendKeys(firstNameText);
    }

    // Set new last name
    public void setLastName(String lastNameText) {
        lastNameTN.clear();
        lastNameTN.sendKeys(lastNameText);
    }

    // Set new email
    public void setEmail(String emailText) {
        emailTN.clear();
        emailTN.sendKeys(emailText);
    }

    // Set new telephone number
    public void setTelephone(String telephoneText) {
        telephoneTN.clear();
        telephoneTN.sendKeys(telephoneText);
    }

    // Click continue to save changes
    public void clickContinue() {
        continueButtonTN.click();
    }

    // Verify if the success message is displayed
    public boolean isSuccessMessageDisplayed() {
        return successMessageTN.isDisplayed();
    }
}
