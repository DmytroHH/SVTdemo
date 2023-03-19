package com.demo.step_definitions;

import com.demo.pages.HomePage;
import com.demo.pages.LoginPage;
import com.demo.utilities.ConfigurationReader;
import com.demo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class negativeRegisteredUserLogin {
    LoginPage loginPage =new LoginPage();
    HomePage homePage=new HomePage();

    WebDriverWait wait = new WebDriverWait(Driver.get(), 20);

    @Given("User at home page and clicked on Login button")
    public void user_at_home_page_and_clicked_on_login_button() {
        wait.until(ExpectedConditions.visibilityOf(homePage.loginBtn));
        homePage.loginButnClick();
    }
    @When("Registered user click on Log In button at Login page and Enters wrong credentials")
    public void registered_user_click_on_log_in_button() {
        loginPage.loginRegisteredUser(ConfigurationReader.getProperty("wrongEmail"),ConfigurationReader.getProperty("wrongPassword"));
    }

    @Then("Warning message will be displayed")
    public void warning_message_will_be_displayed() {
        String warningMsgExpected="WRONG EMAIL OR PASSWORD.";
        Assert.assertEquals(warningMsgExpected,loginPage.warningMessage.getText());
    }
}
