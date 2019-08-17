package com.debenhams.pageobject;

import com.debenhams.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoreFinder extends DriverFactory {
   /* @FindBy(linkText = "Store Finder")
    private WebElement StoreFinderLink;

    @FindBy(id="field-6")
    private WebElement City;

    @FindBy(css=".t-login__signin-arrow")
    private WebElement FindStoreButton;

    public void storeFinder(String city){
        StoreFinderLink.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        City.sendKeys(city);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        FindStoreButton.click();
    }*/
}

