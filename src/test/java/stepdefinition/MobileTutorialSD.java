package stepdefinition;

import cucumber.api.java.de.Wenn;
import framework.mobilePages.HomeScreen;

public class MobileTutorialSD {
    HomeScreen homeScreen = new HomeScreen();

    @Wenn("^I swipe right 3 times on tutorials slides$")
    public void swipe(){
       homeScreen.swipe();
    }
}
