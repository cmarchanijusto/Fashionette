package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VoucherPage extends  BasePage {

    @FindBy(xpath = "//span[contains(@class,'typography__type')]")
    public WebElement goToCartButton;

    @FindBy(xpath = "//a[@class='cart__sum__voucher-link']")
    public WebElement redeemButton;

    @FindBy(xpath="//input[@name='voucherCode']")
    public WebElement couponCheckbox;

    @FindBy(xpath="(//button[@type='submit'])[1]")
    public WebElement secondRedeemButton;

    @FindBy(xpath= "//span[contains(@data-code,'qachallenge')]")
    public WebElement discount;



}
