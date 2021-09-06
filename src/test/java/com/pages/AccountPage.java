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

    @FindBy(xpath = "(//div[@class='account__content__column account__content__column--customer'])[1]")
    public WebElement fullName;








}
