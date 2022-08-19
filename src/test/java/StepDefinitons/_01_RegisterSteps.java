package StepDefinitons;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_RegisterSteps {

    DialogContent dc = new DialogContent(GWD.getDriver());
    //WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    @Given("navigate to parabank")
    public void navigateToParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        GWD.getDriver().manage().window().maximize();
    }

    @When("create a profile")
    public void createAProfile() {
        dc.findAndClick("registerBtn");
        dc.findAndSend("inputFirstName","aaaa");
        dc.findAndSend("inputLastName","aaaa");
        dc.findAndSend("inputStreet","aaaa");
        dc.findAndSend("inputCity","aaaa");
        dc.findAndSend("inputState","aaaa");
        dc.findAndSend("inputZipcode","00000");
        dc.findAndSend("phoneNo","54356556");
        dc.findAndSend("inputSSN","9878978787");
        dc.findAndSend("inputUsername","16group");
        dc.findAndSend("inputPassword","123456");
        dc.findAndSend("repeatedPassword","123456");
        dc.findAndClick("saveBtn");

    }

    @Then("success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMsg","success");
    }

}
