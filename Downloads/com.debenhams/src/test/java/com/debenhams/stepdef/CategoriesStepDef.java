package com.debenhams.stepdef;

import com.debenhams.pageobject.Catogories;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CategoriesStepDef {
    private Catogories catogories = new Catogories();


    @When("^I click Men$")
    public void iClickMen() {
        catogories.menLink();
    }

    @And("^I select a customer \"([^\"]*)\"$")
    public void iSelectACustomer(String customerSelectedCategories) {
        catogories.selectCategorie(customerSelectedCategories);
    }


    @Then("^I should see all the product filtered categories$")
    public void iShouldSeeAllTheProductFilteredCategories() {

    }
}
