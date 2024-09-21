package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageTN extends BasePage { 

    public HomePageTN(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement linkMyAccountTN;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLinkTN;
    
    @FindBy(linkText ="Login")
    WebElement linklogin;

    public void clickMyAccount() {
        linkMyAccountTN.click();
    }

    public void clickRegister() {
        registerLinkTN.click();
    }

    public void clickLogin()
    {
    	linklogin.click();
    }


}


