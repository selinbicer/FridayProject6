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

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String message) {
        dc.findAndContainsText("loginMsg",message);
    }
}
