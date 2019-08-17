package com.debenhams.stepdef;
import com.debenhams.pageobject.SortBy;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;


import java.io.IOException;

public class SortByStepDef {

    private SortBy sortBy = new SortBy();

    @And("^I move to \"([^\"]*)\" Relevance$")
    public void iMoveToRelevance(String customerSelectedSort) {


    }

    @Then("^I select the \"([^\"]*)\"$")
    public void iSelectThe(String customerSelectedPrice) {
        sortBy.sortBy(customerSelectedPrice);

    }

    @Then("^I take the screens shot$")
    public void iTakeTheScreensSort() throws IOException {
        sortBy.sceenShot();

    }
}