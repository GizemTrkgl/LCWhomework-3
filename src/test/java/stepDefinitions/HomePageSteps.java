package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import util.DriverFactory;

public class HomePageSteps {
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    @Given("Enes is on Home page")
    public void enesIsOnHomePage() {homePage.checkHomePage();}


    @When("click {string} card in the top right")
    public void clickCardInTheTopRight(String string) {
        homePage.clickLoginButton(string);
    }
}
