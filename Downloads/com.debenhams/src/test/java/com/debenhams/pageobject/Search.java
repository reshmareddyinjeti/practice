package com.debenhams.pageobject;

import com.debenhams.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends DriverFactory {

    public static String searchProduct;
    @FindBy(css = ".dbh-search-input")
    private WebElement searchTextBox;

    @FindBy(css = ".pw-button__inner")
    private WebElement magnifierGlass;

    public void doSearch(String item) {
        searchProduct=item;
        searchTextBox.sendKeys(item);
        magnifierGlass.click();
    }

    //assertion
    public String getHomePageUrl() {
        return driver.getCurrentUrl();
    }
}

