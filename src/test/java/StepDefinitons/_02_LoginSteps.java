package StepDefinitons;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginSteps {

    DialogContent dc = new DialogContent(GWD.getDriver());

    @When("login with valid name as {string} and password as {string}")
    public void loginWithValidNameAsAndPasswordAs(String username, String password) {
        dc.findAndSend("username",username);
        dc.findAndSend("password",password);
        dc.findAndClick("loginBtn");
    }

    @Then("welcome message should be displayed")
    public void welcomeMessageShouldBeDisplayed() {
        dc.findAndContainsText("welcomeMsg","welcome");
    }
    @When("login with invalid name as {string} and password as {string}")
    public void loginWithInvalidNameAsAndPasswordAs(String username, String password) {
        dc.findAndSend("username",username);
        dc.findAndSend("password",password);
        dc.findAndClick("loginBtn");
    }

    @Then("fail message should be displayed")
    public void failMessageShouldBeDisplayed() {
        dc.findAndContainsText("errorMsg","error");
    }
}
