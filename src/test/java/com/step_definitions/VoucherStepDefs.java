package com.step_definitions;


import com.pages.ShoppingPage;
import com.pages.VoucherPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class VoucherStepDefs {


    ShoppingPage shoppingPage=new ShoppingPage();
    VoucherPage voucherPage = new VoucherPage();

    String expectedDiscount;
    String actualDiscount;


    @Given("user add item to Cart")

    public void user_add_item_to_Cart() {

        shoppingPage.addToCartButton.click();

    }


    @Given("user go to the Cart")

    public void user_go_to_the_Cart() {

        voucherPage.goToCartButton.click();

    }


    @Given("user clicks voucher button")

    public void user_clicks_voucher_button() {

        voucherPage.redeemButton.click();

    }



    @Given("user enters {string}")

    public void user_enters(String string) {

        voucherPage.couponCheckbox.sendKeys(string);

    }



    @When("user clicks redeem button")

    public void user_clicks_redeem_button() {

        voucherPage.secondRedeemButton.click();

    }


    @Then("user should see discount on total price")

    public void user_should_see_discount_on_total_price() {

        actualDiscount=voucherPage.discount.getAttribute("value");
        System.out.println("actualTotal = " + actualDiscount);
        Assert.assertEquals(expectedDiscount,actualDiscount);


    }



}