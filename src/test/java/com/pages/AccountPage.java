package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(xpath = "//div[@class='account-personaldata']")
    public WebElement personalDataButton;

    @FindBy(xpath = "//div[@class='account--address__action account--address__action--update']")
    public  WebElement editButton;

    @FindBy(xpath = "//input[@value='Mr']")
    public WebElement maleButton;

    @FindBy(name = "salutation")
    public WebElement femaleButton;

    @FindBy(xpath="//input[@name='title']")
    public WebElement nameCheckbox;

    @FindBy(xpath="//input[@name='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath="//input[@name='lastName']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumberCheckbox;

    @FindBy(xpath = "//div[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[text()='Cancel']")
    public WebElement cancelButton;



    //this one is not correct can you ask your cousin again:)
    @FindBy(xpath = "/html/body/div[1]/div[3]/div/div[1]/div[2]/div/ul/li[2]/div/div/div[1]/div/div[2]/text()[1]")
    public WebElement fullName;








}
