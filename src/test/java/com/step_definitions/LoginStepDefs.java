package com.step_definitions;

import com.pages.LoginPage;
import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);


    }

    @When("the user enters their credentials")
    public void the_user_enters_their_credentials() {

        String username = ConfigurationReader.get("User");
        String password = ConfigurationReader.get("Password");


        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitFor(3);
        loginPage.login(username,password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Buy designer handbags and accessories online | fashionette",actualTitle);

    }


}
