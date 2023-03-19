package com.demo.pages;

import com.demo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    public SignUpPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id = "1-email")
    public WebElement emailBox;

    @FindBy(xpath = "//div[text()='Email is invalid']")
    public WebElement emailWarningMsg;

    @FindBy(id = "1-password")
    public WebElement passwordBox;

    @FindBy(xpath = "//div[text()='Password is invalid']")
    public WebElement passwordWarningMsg;

    @FindBy(xpath = "//button[@id='1-submit']")
    public WebElement signUpBtn;





}
