package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkskyHomePage;
import org.testng.Assert;

public class DarkskySD {

    private DarkskyHomePage darkskyHomePage = new DarkskyHomePage();

    @Given("^I am on Darksky Home Page$")
    public void iAmOnDarkskyHomePage() {
        Assert.assertTrue(darkskyHomePage.isDarkSkyApiEnable(),"Invalid Home Page");
    }

    @Given("^I am on the darksky Register page$")
    public void iAmOnRegisterPage(){
        darkskyHomePage.clickOnDarkSkyAPI();
        darkskyHomePage.clickOnSignUpButton();
        Assert.assertEquals(darkskyHomePage.getTextRegisterPage(),"Register","Invalid Register Page");
    }

    @When("^I click on Register button$")
    public void iClickOnRegisterButton(){
        darkskyHomePage.clickOnRegisterButton();
    }

    @Then("^I verify error message \"please fill out this field\"$")
    public void iAmOnRegisterPageAfterClick(){
        Assert.assertEquals(darkskyHomePage.getTextRegisterPage(),"Register","Invalid Register Page");
    }

    @Then("^I verify current temp is not greater or less then temps from daily timeline$")
    public void verifyCurrentTemp(){

    }
}
