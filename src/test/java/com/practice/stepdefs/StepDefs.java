package com.practice.stepdefs;

import javax.inject.Inject;
import com.practice.pages.LandingPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

//import io.magentys.cinnamon.webdriver.conditions.ElementConditions.displayed;
import static io.magentys.cinnamon.webdriver.conditions.ElementConditions.*;

public class StepDefs {

    private final LandingPage landingPage;

    @Inject
    public StepDefs(final LandingPage landingPage) {
        this.landingPage = landingPage;
    }

    @Given("^I am on amazon home page$")
    public void i_am_on_amazon_home_page() {
        // Write code here that turns the phrase above into concrete actions
    	landingPage.amazonIcon.waitUntil(displayed);
    	
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        landingPage.enterSearchDetails(arg1);
        landingPage.clickSearchButton();
    }

    @Then("^I should see list of different iPhones$")
    public void i_should_see_list_of_different_iPhones() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    
    }
}