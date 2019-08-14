package com.girls.pageobjects;

import com.girls.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePages extends DriverFactory {
    public static String searchProduct;
    @FindBy(css = "#searchTerm")
    private WebElement searchTextBox;

    @FindBy(css = "._2mKaC")
    private WebElement magnifierGlass;

    @FindBy(css=".search-title__term")
    private WebElement pageHeader;


    public void doSearch(String item) {
        searchProduct=item;
        searchTextBox.sendKeys(item);
        magnifierGlass.click();
    }

    //assertion
    public String getHomePageUrl()
    {
        return driver.getCurrentUrl();
    }

    public String getHomePageHeader(){
        return pageHeader.getText();
    }

}

