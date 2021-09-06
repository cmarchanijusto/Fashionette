package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

        public LoginPage(){
            PageFactory.initElements(Driver.get(), this);
        }

       @FindBy (id="uc-btn-accept-banner")
        public WebElement cookies;

        @FindBy(name="email")
        public WebElement userName;

        @FindBy(name="password")
        public WebElement password;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement submit;

        @FindBy(xpath = "//span[@class='icon icon--user-active']")
        public WebElement loginButton;


        public void login(String userNameStr, String passwordStr)  {



            userName.sendKeys(userNameStr);
            password.sendKeys(passwordStr);
            submit.click();

        }


    }


