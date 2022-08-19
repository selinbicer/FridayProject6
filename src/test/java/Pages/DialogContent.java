package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{

    public DialogContent(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (linkText = "Register")
    private WebElement registerBtn;

    @FindBy (id = "customer.firstName")
    private WebElement inputFirstName;

    @FindBy (id = "customer.lastName")
    private WebElement inputLastName;

    @FindBy (xpath = "//input[contains(@name,\"address.street\")]")
    private WebElement inputStreet;

    @FindBy (xpath = "//input[contains(@name,\"address.city\")]")
    private WebElement inputCity;

    @FindBy (xpath = "//input[contains(@name,\"address.state\")]")
    private WebElement inputState;

    @FindBy (xpath = "//input[contains(@name,\"address.zipCode\")]")
    private WebElement inputZipcode;

    @FindBy (xpath = "//input[contains(@name,\".phoneNumber\")]")
    private WebElement phoneNo;

    @FindBy (id = "customer.ssn")
    private WebElement inputSSN;

    @FindBy (id = "customer.username")
    private WebElement inputUsername;

    @FindBy (id = "customer.password")
    private WebElement inputPassword;

    @FindBy (id = "repeatedPassword")
    private WebElement repeatedPassword;

    @FindBy (css = "[value='Register']")
    private WebElement saveBtn;

    @FindBy(css = "[id='rightPanel']>p")
    private WebElement successMsg;

    //**********

    @FindBy (name = "username")
    private WebElement username;

    @FindBy (name = "password")
    private WebElement password;

    @FindBy ( css = "[value=\"Log In\"]")
    private WebElement loginBtn;

    @FindBy (css = "h1[class=\"title\"]")
    private WebElement loginMsg;

    //*****
    @FindBy(linkText = "Bill Pay")
    private WebElement billPayLink;

    @FindBy(name = "payee.name")
    private WebElement billName;

    @FindBy(name = "payee.accountNumber")
    private WebElement accNo;

    @FindBy(name = "verifyAccount")
    private WebElement verifyAccNo;

    @FindBy(name = "amount")
    private WebElement amount;

    @FindBy(css = "[value=\"Send Payment\"]")
    private WebElement sendPaymentBtn;

    @FindBy (css = "[ng-show=\"showResult\"]>h1")
    private WebElement paymentResult;

    WebElement myElement;
    public void findAndSend(String strElement, String value){

        switch (strElement){
            case "inputFirstName" : myElement = inputFirstName; break;
            case "inputLastName" : myElement = inputLastName; break;
            case "inputStreet" : myElement = inputStreet; break;
            case "inputCity" : myElement = inputCity; break;
            case "inputState" : myElement = inputState; break;
            case "inputZipcode" : myElement = inputZipcode; break;
            case "phoneNo" : myElement = phoneNo; break;
            case "inputSSN" : myElement = inputSSN; break;
            case "inputUsername" : myElement = inputUsername; break;
            case "inputPassword" : myElement = inputPassword; break;
            case "repeatedPassword" : myElement = repeatedPassword; break;
            case "username" : myElement = username; break;
            case "password" : myElement = password; break;
            case "billName" : myElement = billName; break;
            case "accNo" : myElement = accNo; break;
            case "verifyAccNo" : myElement = verifyAccNo; break;
            case "amount" : myElement = amount; break;
        }
        sendKeysFunction(myElement, value);
    }
    public void findAndClick(String strElement){

        switch (strElement){
            case "registerBtn" : myElement = registerBtn; break;
            case "saveBtn" : myElement = saveBtn; break;
            case "loginBtn" : myElement = loginBtn; break;
            case "billPayLink" : myElement = billPayLink; break;
            case "sendPaymentBtn" : myElement = sendPaymentBtn; break;
        }
        clickFunction(myElement);
    }
    public void findAndContainsText(String strElement, String text){

        switch (strElement){
            case "successMsg" : myElement = successMsg; break;
            case "loginMsg" : myElement = loginMsg; break;
            case "paymentResult" : myElement = paymentResult; break;
        }
        verifyContainsText(myElement,text);
    }

}
