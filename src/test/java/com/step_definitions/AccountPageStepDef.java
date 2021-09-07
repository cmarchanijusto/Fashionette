package com.step_definitions;

import com.pages.AccountPage;
import com.pages.ShoppingPage;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class AccountPageStepDef  {

           AccountPage accountPage=new AccountPage();
           ShoppingPage shoppingPage=new ShoppingPage();



    @Given("user clicks to Personal Data")
    public void user_clicks_to_Personal_Data() {
        BrowserUtils.waitFor(2);
        accountPage.personalDataButton.click();
    }

    @Given("user clicks edit button")
    public void user_clicks_edit_button() {
        BrowserUtils.waitFor(2);
        accountPage.editButton.click();

    }

    @Given("user enters new data")
    public void user_enters_new_data() {
        BrowserUtils.waitFor(2);
        String newName="NewLife";
        String newlastname="Welcome";

        accountPage.femaleButton.click();
        accountPage.firstNameBox.clear();
        accountPage.firstNameBox.sendKeys(newName);
        accountPage.lastNameBox.clear();
        accountPage.lastNameBox.sendKeys(newlastname);

    }

    @When("user clicks save button")
    public void user_clicks_save_button() throws InterruptedException {
        accountPage.saveButton.click();

        FluentWait <WebDriver> wait = new FluentWait<WebDriver>(Driver.get())
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOf(accountPage.editButton));



    }

    @Then("user should see personal data saved")
    public void user_should_see_personal_data_saved() {

        String expectedFullName="Mr NewLife Welcome";
        String[] details = (accountPage.fullName).getText().split("\n");
        String actualFullName= details[0].trim();

        Assert.assertEquals(expectedFullName,actualFullName);

    }


}
