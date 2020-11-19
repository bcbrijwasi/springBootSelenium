package com.spring.springBootSelenium.bdd;

import com.spring.springBootSelenium.kelvin.annotation.LazyAutowired;
import com.spring.springBootSelenium.page.google.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

@SpringBootTest
public class GoogleSteps {
    @LazyAutowired
    private GooglePage googlePage;

    @When("Load google page")
    public void loadGooglePage() {
        googlePage.goTo();
    }

    @And("Search for {string}")
    public void search(String arg0) {
        googlePage.getSearchComponent().search(arg0);
    }

    @Then("Verify search result count is {int}")
    public void verifySearchResultCount(int arg0) {
        Assert.assertTrue(googlePage.getSearchResultComponent().getResultCount() >= arg0, "Current search result found");
    }

    @And("Wait for google page to load")
    public void waitForGooglePageToLoad() {
        googlePage.isLoaded();

    }

    @And("Wait for search result page to load")
    public void waitForSearchResultPageToLoad() {
        googlePage.getSearchResultComponent().isLoaded();
    }
}