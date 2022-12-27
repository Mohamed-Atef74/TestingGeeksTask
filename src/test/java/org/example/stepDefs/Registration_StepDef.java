package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.*;


public class Registration_StepDef{

    @Given("User is on the registration page")
    public void openRegistrationPage(){
        driver.navigate().to("https://web.zid.sa/register");
    }

    @When("User enters {string} in the name field")
        public void enterName(String name){
        registrationElements.name().sendKeys(name);
    }

    @And("User enters {string} in the email field")
    public void enterEmail(String email){
        registrationElements.email().sendKeys(email);
    }

    @And("User enters {string} in the password field")
    public void enterPassword(String password){
        registrationElements.password().sendKeys(password);
    }

    @And("User enters {string} in the mobile field")
    public void enterMobile(String mobile){
        registrationElements.mobile().sendKeys(mobile);
    }

    @And("User clicks on register button")
    public void clickOnRegistrationButton(){
        registrationElements.registerButton().click();
    }

    @Then("User should be redirected to the OTP page")
    public void OTPVerification(){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.urlToBe("https://web.zid.sa/phone_verification"));
        Assert.assertTrue(otpVerificationElements.pageHeader().isDisplayed());
    }

    @Then("{string} message should appear")
    public void errorMessage(String error){
        Assert.assertTrue(registrationElements.errorMessage().getText().contains(error));
    }

}
