package com.demo.step_definitions;

import com.demo.pages.HomePage;
import com.demo.pages.SignUpPage;
import com.demo.utilities.BrowserUtils;
import com.demo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signUpNegativeTesting {
    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();
    WebDriverWait wait = new WebDriverWait(Driver.get(), 20);

    @Given("User at Sign Up page")
    public void user_at_sign_up_page() {
        homePage.loginButnClick();
    }

    @When("User provides invalid email")
    public void user_provides_invalid_email() {
        BrowserUtils.switchToCurrentTab();
        signUpPage.emailBox.sendKeys("invalidEmail");
    }

    @Then("Email is invalid message will be displayed")
    public void email_is_invalid_message_will_be_displayed() {
        signUpPage.signUpBtn.click();
        Assert.assertEquals("Email is invalid", signUpPage.emailWarningMsg.getText());
    }


    @When("User provides invalid password")
    public void userProvidesInvalidPassword() {
        BrowserUtils.switchToCurrentTab();
        signUpPage.passwordBox.sendKeys("1we  ef");
    }

    @Then("Password is invalid message will be displayed")
    public void passwordIsInvalidMessageWillBeDisplayed() {
        signUpPage.signUpBtn.click();
        wait.until(ExpectedConditions.visibilityOf(signUpPage.passwordWarningMsg));
        Assert.assertEquals("Password is invalid", signUpPage.passwordWarningMsg.getText());
    }
}
