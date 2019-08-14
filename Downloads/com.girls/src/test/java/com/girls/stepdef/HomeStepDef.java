package com.girls.stepdef;

import com.girls.pageobjects.HomePages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;


public class HomeStepDef {
    private HomePages homePage = new HomePages();
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
        String actual= homePage.getHomePageUrl();
        assertThat("home page not displayed",actual, Matchers.endsWith("co.uk/"));
        // String actual1=homePage.getHomePageHeader();
        //assertThat("header are not equal",actual1,is(equalToIgnoringWhiteSpace(homePage.getHomePageHeader())));
    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void iSearchForAProduct(String item) {
        homePage.doSearch(item);
    }

    @Then("^I selected the filtered product$")
    public void iSelectedTheFilteredProduct() {
        homePage.getHomePageHeader();

    }
}
