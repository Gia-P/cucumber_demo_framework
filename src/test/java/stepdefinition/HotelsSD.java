package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HotelsHomePage;
import org.testng.Assert;

/**
 * Created by Gia Pachkhatashvili
 */
public class HotelsSD {
    private HotelsHomePage hotelsHomePage = new HotelsHomePage();
    public String city = "boston, massachusetts,";
    // new york cities need specific testing

    @Given("^I am on Hotels Home Page$")
    public void iAmOnHotelsHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://www.hotels.com/", "Invalid Hotels.com Home page");
    }

    @Given("^I am on default locations search result screen$")
    public void setCityTextField() throws InterruptedException {
        hotelsHomePage.setCityTextField(city);
        Assert.assertEquals(hotelsHomePage.iamOnSearchResultPage(),"How we get paid influences your sort order", "Invalid Hotels.com search result page");
    }

    @When("^I select property class (.+)$")
    public void selectStars(String stars){
        switch (stars){
            case "5 stars":
                hotelsHomePage.clickOnFiveStars();
                break;
            case "4 stars":
                hotelsHomePage.clickOnForStars();
                break;
            case "3 stars":
                hotelsHomePage.clickOnThreeStars();
                break;
        }
    }

    @Then("^I verify system displays only (.+) hotels on search result$")
    public void verifyDisplaysStars(String stars) throws InterruptedException {
        switch (stars){
            case "5 stars":
                Assert.assertTrue(hotelsHomePage.isDisplaysOnlyFiveStarsResult(), "System displays incorrectly 5 stars");
                break;
            case "4 stars":
                Assert.assertTrue(hotelsHomePage.isDisplaysOnlyForStarsResult(), "System displays incorrectly 4 stars");
                break;
            case "3 stars":
                Assert.assertTrue(hotelsHomePage.isDisplaysOnlyThreeStarsResult(),"System displays incorrectly 3 stars");
                break;
        }
    }

    @Then("^I verify system displays all hotels within 10 miles radius of airport$")
    public void verifyDisplaysRadiusAirport() throws InterruptedException {
        Assert.assertTrue(hotelsHomePage.isDisplaysRadiusAirport(), "System not displays all hotels within 10 miles radius of airport");
    }

    @And("^I verify (.+) is within 10 miles radius of downtown$")
    public void verifyDisplaysRadiusDowntown(String hotel) throws InterruptedException {
        hotelsHomePage.setHotelTextFiled(hotel);
        Assert.assertTrue(hotelsHomePage.isDisplaysRadiusDowntown(),"System not displays all hotels within 10 miles radius of downtown");
    }
}
