package com.girls.pageobjects;
import com.girls.driver.DriverFactory;
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

public class ResultsPage extends DriverFactory {
    public static String expectedCustomersort;
    @FindBy(css=".sort-select")
    private WebElement SortBy;
    @FindBy (css=".ac-product-price__amount")
    private List<WebElement> priceAmount;

public void moveToSort(String customerSelectedSort ){
    Actions action=new Actions(driver) ;
      action.moveToElement(SortBy).build().perform();
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
            // List<WebElement> sortByWebelements=driver.findElements(By.cssSelector(".ac-product-price__amount"));
            for (WebElement sortByWebElement: priceAmount){
                String sortInString=sortByWebElement.getText();
                //double sortInDouble=Double.parseDouble(sortInString);
                System.out.println(collectedSort);
               // collectedSort.add(sortInDouble);
            }return  collectedSort;

        }


    public void sceenShot()
            throws IOException
    {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("/Users/sandeep/Downloads/com.girls/src/test/java/com/girls/argos.png"));


    }
}


