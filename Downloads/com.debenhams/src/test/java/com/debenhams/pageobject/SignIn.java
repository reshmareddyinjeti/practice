package com.debenhams.pageobject;

import com.debenhams.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn extends DriverFactory {
    @FindBy(linkText = "Create Account/Sign In")
    private WebElement account;

    @FindBy(id = "field-1")
    private WebElement email;

    @FindBy(id="field-2")
    private WebElement pass;

    @FindBy(css=".pw-button__inner")
    private WebElement signin;
    public void sign(){
        account.click();
        email.sendKeys("pundarikakshareddy555@gmail.com ");
        pass.sendKeys("sandipani555");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        signin.click();
    }
}

