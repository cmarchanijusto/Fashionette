package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingPage  extends BasePage{

    @FindBy(id="uc-btn-accept-banner")
    public WebElement cookies;

    @FindBy(xpath = "//a[@title='Search']")
    public  WebElement searchBox;

    @FindBy(name = "q")
    public WebElement bigSearchBox;

    @FindBy(xpath = "(//div[@class='product--list__item__image'])[1]")
    public WebElement firstItem;

    @FindBy(name="email")
    public WebElement userName;

    @FindBy(name="password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//span[@class='icon icon--user']")
    public WebElement loginButton;

    @FindBy (xpath="//div[contains(@class,'product-details__add-to-cart-container')]//span[contains(@class,'icon--bag-white--alternative')]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='cart--header__button__text typography__type-3--bold text__uppercase']")
    public WebElement goToCartButton;

    @FindBy(xpath = "//div[@class='cart--header__headline typography__type-16--bold text__uppercase']")
    public WebElement cartTotalCheckHeader;

   @FindBy(id = "cart__total")
   public WebElement cartTotal;


    public void login(String userNameStr, String passwordStr)  {

        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();

    }







}
