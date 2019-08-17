package com.debenhams.pageobject;

import com.debenhams.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Catogories extends DriverFactory {

    public static String expectedCustomerRating;
    @FindBy(linkText = "Men")
    private WebElement menlink;
    @FindBy(css = ".pw-accordion__content .t-product-list__filter-modal-items")
    private List<WebElement> customerCategories;

    @FindBy(css = "")
    private List<WebElement> customerSelectedCt;
    public void menLink(){
        menlink.click();
    }

    public void selectCategorie(String customerSelectedCategories) {
       for (WebElement ratingWebElement :customerCategories) {
            if (ratingWebElement.getText().equalsIgnoreCase(customerSelectedCategories)) {
                new WebDriverWait(driver, 20)
                        .until(ExpectedConditions.elementToBeClickable(ratingWebElement));
                ratingWebElement.click();
                break;

            }
        }
    }

   /* public List<Double> getsOnFilteredProduct() {


            double ratingInDouble = Double.parseDouble(catInSting);
            // System.out.println("Collected rating :"+collectedRating);
            collectedRating.add(ratingInDouble);

        }
        return categorie;*/
    }

