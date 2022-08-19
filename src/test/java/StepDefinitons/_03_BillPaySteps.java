package StepDefinitons;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_BillPaySteps {

    DialogContent dc = new DialogContent(GWD.getDriver());

    @When("navigate to bill pay page")
    public void navigateToBillPayPage() {
        dc.findAndClick("billPayLink");
    }

    @Then("user should fill name as {string}")
    public void userShouldFillNameAs(String BillName) {
        dc.findAndSend("billName",BillName);
    }

    @And("user fill other info boxes and writes the amount {string}")
    public void userFillOtherInfoBoxesAndWritesTheAmount(String billAmount) {
        dc.findAndSend("inputStreet","ıuyıuyuı");
        dc.findAndSend("inputCity","jhghjghj");
        dc.findAndSend("inputState","ljlkjlkj");
        dc.findAndSend("inputZipcode","8686");
        dc.findAndSend("phoneNo","87675545");
        dc.findAndSend("accNo","17784");
        dc.findAndSend("verifyAccNo","17784");
        dc.findAndSend("amount",billAmount);
        dc.findAndClick("sendPaymentBtn");
    }

    @Then("verify payment message")
    public void verifyPaymentMessage() {
        dc.findAndContainsText("paymentResult","Complete");
    }
}
