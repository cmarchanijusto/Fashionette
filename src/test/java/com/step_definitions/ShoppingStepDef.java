package com.step_definitions;

import com.pages.LoginPage;
import com.pages.ShoppingPage;
import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ShoppingStepDef {


       ShoppingPage shoppingPage=new ShoppingPage();
       LoginPage loginPage = new LoginPage();

       String expectedTotal;
       String actualTotal;

    @Given("user goes to homepage")
    public void user_goes_to_homepage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }

    @Given("user accept cookies")
    public void user_accept_cookies() {
        shoppingPage.cookies.click();
    }

    @Given("user search for {string}")
    public void user_search_for(String string) {


         shoppingPage.searchBox.click();
          BrowserUtils.waitFor(1);
         shoppingPage.bigSearchBox.sendKeys(string);



    }

    @Given("user select the first option")
    public void user_select_the_first_option() {
        shoppingPage.firstItem.click();
        BrowserUtils.waitFor(1);
    }

    @Given("user add item to the Cart")
    public void user_add_item_to_Cart() {

        BrowserUtils.waitFor(2);
        shoppingPage.addToCartButton.click();


    }

    @Given("user clicks to login page")
    public void user_clicks_to_login_page() {

        shoppingPage. loginButton.click();
    }

    @Given("user enters credentials and login")
    public void user_enters_email_and_password_and_login() {
        String username = ConfigurationReader.get("User");
        String password = ConfigurationReader.get("Password");



        BrowserUtils.waitFor(3);
        loginPage.login(username,password);



    }


    @When("user goes to the Cart")
    public void user_go_to_the_Cart() {


        String expectedTotal=shoppingPage.cartTotalCheckHeader.getText();
        System.out.println("expectedTotal = " + expectedTotal);

        BrowserUtils.waitFor(1);
        shoppingPage.goToCartButton.click();



    }

    @Then("user should see total price on the cart")
    public void user_should_see_total_price_on_the_cart() {


        actualTotal=shoppingPage.cartTotal.getAttribute("value");
        System.out.println("actualTotal = " + actualTotal);


        Assert.assertEquals(expectedTotal,actualTotal);




    }



















}
