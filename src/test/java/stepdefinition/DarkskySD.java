package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.DarkskyHomePage;
import org.testng.Assert;

public class DarkskySD {

    private DarkskyHomePage darkskyHomePage = new DarkskyHomePage();
    /*  Eastern Daylight Time:  New York / Central Daylight Time:  Chicago
        Mountain Daylight Time:  Denver / Mountain Standard Time:  Phoenix
        Pacific Daylight Time:  Los Angeles / Alaska Daylight Time: Anchorage (GMT-8)
        Hawaii-Aleutian Standard Time: Honolulu
    */

    public String city = "Honolulu";

    @Given("^I am on Darksky Home Page$")
    public void iAmOnDarkskyHomePage() {
        Assert.assertTrue(darkskyHomePage.isTimelineDisplayed(),"Invalid Home Page");
        //Assert.assertEquals(SharedSD.getDriver().getPageSource(),"Dark Sky","Invalid Home Page");
    }

    @Given("^I am on the darksky Register page$")
    public void iAmOnRegisterPage(){
        darkskyHomePage.clickOnDarkSkyAPI();
        darkskyHomePage.clickOnSignUpButton();
        Assert.assertEquals(SharedSD.getDriver().getTitle(),"Dark Sky API: Register","Invalid Register Page");
    }

    @When("^I click on Register button$")
    public void iClickOnRegisterButton(){
        darkskyHomePage.clickOnRegisterButton();
    }

    @When("^I expand todays timeline$")
    public void clickOnTodaysTimeline() throws InterruptedException {
        darkskyHomePage.scrollDown();
        Thread.sleep(500);
        darkskyHomePage.clickOnDayOpen();
    }

    @When("^I enter city into search text field on home screen$")
    public void setCityTextField(){
        darkskyHomePage.setSearchTextField(city);
    }

    @And("^I verify city's time zone$")
    public String timezone(){
        return darkskyHomePage.timeZone(city);
    }

    @Then("^I verify error message \"please fill out this field\"$")
    public void iAmOnRegisterPageAfterClick(){
        Assert.assertEquals(SharedSD.getDriver().getTitle(),"Dark Sky API: Register","Invalid Register Page after click on Register Button");
    }

    @Then("^I verify current temp is not greater or less then temps from daily timeline$")
    public void verifyCurrentTemp(){
        Assert.assertFalse(darkskyHomePage.currentTempIsGreaterOrLess(),"Current Temp out of timeline shit");
    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void lowHighTempDispelCorrect(){
        Assert.assertTrue(darkskyHomePage.isLowHighTempDispelCorrect(),"Lowest and highest temp isn't displayed correctly");
    }

    @Then("^I verify timeline is displayed with two hours incremented$")
    public void timelineDisplayedTwoHours(){
        Assert.assertTrue(darkskyHomePage.isTimelineDisplayedTwoHours(2, timezone()),"Timeline isn't displayed with two hours incremented");
    }
}
