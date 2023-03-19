package com.demo.pages;

import com.demo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public  HomePage(){
        PageFactory.initElements(Driver.get(),this);
    }
    WebDriverWait wait = new WebDriverWait(Driver.get(),20);

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public  WebElement loginBtn;



    public void loginButnClick(){
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        loginBtn.click();
    }

}
