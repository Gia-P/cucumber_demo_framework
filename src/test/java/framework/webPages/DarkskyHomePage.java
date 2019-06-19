package framework.webPages;

import org.openqa.selenium.By;

public class DarkskyHomePage extends BasePage {

    private By darkSkyAPI = By.linkText("Dark Sky API");
    private By signUpButton = By.xpath("//a[@class='button filled']");
    private By register = By.xpath("//h1[@class='stand-alone title']");
    private By registerButton = By.xpath("//button[contains(text(),'Register')]");
    private By currentTemp = By.className("summary swap");

    public boolean isDarkSkyApiEnable(){
        return isElementEnabled(darkSkyAPI);
    }

    public void clickOnDarkSkyAPI(){
        clickOn(darkSkyAPI);
    }

    public void clickOnSignUpButton(){
        clickOn(signUpButton);
    }

    public String getTextRegisterPage(){
        return getTextFromElement(register);
    }

    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }
}
