package com.qa.automationpractice;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.MatcherAssert.assertThat;


public class AppTest {
public static WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

    }
    @AfterMethod
    public void teardown(){
       // driver.quit();
    }
    @Test
    public void test(){
        driver.findElement(By.id("search_query_top")).sendKeys("T SHIRTS");
        driver.findElement(By.xpath("//button[@name='submit_search'] ")).click();
        String actualPageHedder=driver.findElement(By.cssSelector(".lighter")).getText();
       // System.out.println("ActualHeader: "+actualPageHedder);
        String expected="T SHIRTS";
        System.out.println(expected);
        String  acualHeader=actualPageHedder.replaceAll("\"","");
        System.out.println(acualHeader);
        Assert.assertEquals(acualHeader,expected);
        System.out.println("test");
    }
    @Test
    public void singIn() throws InterruptedException {
        driver.findElement(By.cssSelector(".login")).click();
        driver.findElement(By.id("email_create")).sendKeys("kunni151014@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
       String getCurent =getUrl();
        System.out.println(getCurent);
      //  assertThat(getCurent,equals("http://automationpractice.com/index.php?controller=authentication&back=my-account"));
      //  assertThat(getCurent,equalsIgnoreCase("http://automationpractice.com/index.php?controller=authentication&back=my-account"));
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Reshma");
        driver.findElement(By.id("customer_lastname")).sendKeys("R");
        driver.findElement(By.id("passwd")).sendKeys("reshma555");
        WebElement days = driver.findElement(By.id("days"));
        WebElement month = driver.findElement(By.id("months"));
        WebElement year = driver.findElement(By.id("years"));
        Thread.sleep(1000);
        Select select = new Select(days);
        select.selectByValue("10");
        Select select1=new Select(month);
        select1.selectByValue("5");
        Thread.sleep(1000);
        Select select2=new Select(year);
        select2.selectByValue("1972");
       // selectValuesFromDropDown(days,"5");
    // selectValuesFromDropDown(month,"January");
    // selectValuesFromDropDown(year,"1972");
     driver.findElement(By.id("company")).sendKeys("asda");
     driver.findElement(By.id("address1")).sendKeys("13,RollitCrescent");
     driver.findElement(By.id("city")).sendKeys("west London");
     WebElement state=driver.findElement(By.id("id_state"));
     Select sel=new Select(state);
     sel.selectByVisibleText("Indiana");
     driver.findElement(By.id("postcode")).sendKeys("TW3 3SF");
     driver.findElement(By.id("phone_mobile")).sendKeys("07925392752");
     //driver.findElement(By.id("submitAccount")).click();


    }
    public static void selectValuesFromDropDown(WebElement element,String value){
        Select select=new Select(element);
        select.selectByVisibleText(value);

    }
    @Test
    public void BasketTest() throws InterruptedException {
       driver.findElement(By.id("search_query_top")).sendKeys("T shirts");
        driver.findElement(By.xpath("//button[@name='submit_search'] ")).click();
        WebElement sortBy=driver.findElement(By.id("selectProductSort"));
     Select select =new Select(sortBy);
    select.selectByVisibleText("Price: Lowest first");
        List<WebElement> listOfWebelements=driver.findElements(By.cssSelector(".product-name"));
       // System.out.println(listOfWebelements.size());
        int sizeOfList=listOfWebelements.size();
        int randomNumber=random(sizeOfList);
        //assertion
        String randomProductInString=listOfWebelements.get(randomNumber).getText();
        System.out.println(randomProductInString);
        listOfWebelements.get(randomNumber).click();
        Thread.sleep(3000);
        driver.findElement(By.id("add_to_cart")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Proceed to checkout")).click();
       List<WebElement> listProduct=driver.findElements(By.cssSelector(".product-name"));
       for (WebElement webelements:listProduct){
          String actual= webelements.getText();
           System.out.println(actual);
         // assertThat(actual,equals(randomProductInString));
           System.out.println("actual=expected");
       }



    }
    public int random(int size){
        Random random=new Random();
        return random.nextInt(size-1);
    }
    public String getUrl(){
      return  driver.getCurrentUrl();
    }
}
