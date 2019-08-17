package com.debenhams.stepdef;

import com.debenhams.pageobject.Filter;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class FilterStepDef {
    private Filter filter=new Filter();
    @When("^I move to Men$")
    public void iMoveToMen() {
        filter.customerSelectedLink();
    }

    @And("^I click on All shoes & boots$")
    public void iClickOnAllShoesBoots() {
        filter.selectedLink();
    }
    @Then("^I able to see the product$")
    public void iAbleToSeeTheProduct() {
    }

    @Then("^I take a Screen shot$")
    public void iTakeAScreensShot() throws IOException {
        filter.sceenShot();
    }

}
