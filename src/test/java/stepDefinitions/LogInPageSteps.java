package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LogInPage;
import util.DriverFactory;

public class LogInPageSteps {
    LogInPage logInPage = new LogInPage(DriverFactory.getDriver());
    @Then("should see Login Page")
    public void shouldSeeLoginPage() {logInPage.textCheck();}

    @Given("Enes is on Login Page")
    public void enesIsOnLoginPage() {logInPage.checkLoginPage();}

    @When("click {string} radio button")
    public void clickRadioButton(String string) {logInPage.clickEposta(string);}

    @Then("should see {string} title")
    public void shouldSeeTitle(String string) {logInPage.checkGirisYap(string);}

    @Then("should see {string} radio button")
    public void shouldSeeRadioButton(String button) {logInPage.checkButton(button);}

    @Then("should see {string} text on Email")
    public void shouldSeeTextOnEmail(String text) {logInPage.checkEpostaText(text);}

    @Then("should see {string} text on Password")
    public void shouldSeeTextOnPassword(String text) {logInPage.checkPasswordText(text);}

    @Then("should see Show Password Icon")
    public void shouldSeeShowPasswordIcon() {logInPage.checkIcon();}

    @Then("should see {string} remember me")
    public void shouldSeeRememberMe(String string) {logInPage.checkRememberMe(string);}

    @Then("should see {string} forgot password")
    public void shouldSeeForgotPassword(String string) {logInPage.checkForgotPassword(string);}

    @Then("should see {string} login button")
    public void shouldSeeLoginButton(String string) {logInPage.checkLoginButton(string);}

    @When("click {string} radio buttonn")
    public void clickRadioButtonn(String string) {logInPage.clickTel(string);}

    @Then("should see Phone Text Box")
    public void shouldSeePhoneTextBox() {logInPage.checkPhoneBox();}

    @When("click login button")
    public void clickLoginButton() {logInPage.clickLoginButton();}

    @Then("should see {string} Email Empty message")
    public void shouldSeeEmailEmptyMessage(String string) {logInPage.checkMail();}

    @Then("should see {string} Password Empty message")
    public void shouldSeePasswordEmptyMessage(String string) {logInPage.checkPassword();}

    @When("type Email {string}")
    public void typeEmail(String string) {logInPage.mail(string);}

    @When("type Password {string}")
    public void typePassword(String string) {logInPage.password(string);}

    @Then("should not see Email Empty message")
    public void shouldNotSeeEmailEmptyMessage() {logInPage.checkEmptyMail();
    }
    
    @Then("should not see Password Empty message")
    public void shouldNotSeePasswordEmptyMessage() {
        logInPage.checkEmptyPassword();
    }

    @When("type Email {string} and click login")
    public void typeEmailAndClickLogin(String string) {logInPage.wrongMail(string);}
    @Then("should see {string} Email False message")
    public void shouldSeeEmailFalseMessage(String string) {logInPage.checkMailMessage();}

    @When("type Email {string}, Password {string} and click login")
    public void typeEmailPasswordAndClickLogin(String mail, String password) {logInPage.falseLogin(mail,password);}

    @Then("should see {string} Login Error message")
    public void shouldSeeLoginErrorMessage(String string) {logInPage.error();}
}
