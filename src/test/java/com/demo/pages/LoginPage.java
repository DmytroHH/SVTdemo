package com.demo.pages;

import com.demo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    WebDriverWait wait =new WebDriverWait(Driver.get(),20);

    @FindBy(xpath = "//a[text()='Log In']/parent::li")
    public  WebElement userLogInTop;

    @FindBy(id = "1-email")
   public WebElement emailBox;

    @FindBy(id = "1-password")
    public WebElement passwordBox;

    @FindBy(id = "1-submit")
   public WebElement loginBtn;

    @FindBy(xpath = "//span[@*='animated fadeInUp']")
    public WebElement warningMessage;


    public  void loginRegisteredUser(String email,String password){

        String originalWindowHandle = Driver.get().getWindowHandle();
        for (String windowHandle : Driver.get().getWindowHandles()) {
            if (!windowHandle.equals(originalWindowHandle)) {
                Driver.get().switchTo().window(windowHandle);
                break;
            }
        }
        wait.until(ExpectedConditions.elementToBeClickable(userLogInTop));
        userLogInTop.click();
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        wait.until(ExpectedConditions.visibilityOf(loginBtn));
        loginBtn.click();
        wait.until(ExpectedConditions.visibilityOf(warningMessage));

    }

}
