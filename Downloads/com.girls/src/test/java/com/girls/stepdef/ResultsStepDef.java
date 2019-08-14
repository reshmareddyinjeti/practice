package com.girls.stepdef;

import com.girls.pageobjects.HomePages;
import com.girls.pageobjects.ResultsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class ResultsStepDef {
    private HomePages homePage = new HomePages();
    private ResultsPage resultsPage =new ResultsPage();


    @And("^I move to \"([^\"]*)\" Relevance$")
    public void iMoveToRelevance(String customerSelectedSort) {
        resultsPage.moveToSort(customerSelectedSort);
    }

    @Then("^I select the \"([^\"]*)\"$")
    public void iSelectThe(String customerSelectedPrice) {
       resultsPage.sortBy(customerSelectedPrice);
         resultsPage.getAllSortedProductOnPrice();
       // assertThat("sort is not selected",actuallist.equals("£"));
    }

    @Then("^I take the screens sort$")
    public void iTakeTheScreensHort() {
        try {
            resultsPage.sceenShot();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}