package com.debenhams.pageobject;

import com.debenhams.driver.DriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SortBy extends DriverFactory {
   // public static String expectedCustomersort;
    @FindBy(css=".u-color-neutral-70")
    private WebElement SortBy;
    @FindBy (css=".dbh-price")
    private List<WebElement> priceAmount;

    public void moveToSort(){
        SortBy.click();
       // Actions action=new Actions(driver) ;
       // action.moveToElement(SortBy).build().perform();
    }
    public void sortBy(String customerSelectedPrice) {
        Select select=new Select(SortBy);
        select.selectByVisibleText(customerSelectedPrice);
    }
    public List<Double> getAllSortedProductOnPrice(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Double> collectedSort=new ArrayList<>();
        for (WebElement sortByWebElement: priceAmount){
            String sortInString=sortByWebElement.getText();
            System.out.println(collectedSort);
        }return  collectedSort;

    }
    public void sceenShot()
            throws IOException
    {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("/Users/sandeep/Downloads/com.debenhams/src/test/java/com/debenhams/Debenhams.png"));
    }
}

