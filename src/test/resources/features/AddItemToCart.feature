
Feature: As a user I want to be able to adding an item to Cart

  @first
  Scenario: The user should be able to add new product to the cart and login

    Given  user goes to homepage
    And    user accept cookies
    And    user search for "women bags"
    And    user select the first option
    And    user add item to the Cart
    And    user clicks to login page
    And    user enters credentials and login
    When   user goes to the Cart
    Then   user should see total price on the cart

   @second
   Scenario:Modify user information
     Given  user goes to homepage
     And    user accept cookies
     And    user clicks to login page
     And    user enters credentials and login
     And    user clicks to Personal Data
     And    user clicks edit button
     And    user enters new data
     When   user clicks save button
     Then   user should see personal data saved

@third
   Scenario: Apply a voucher
     Given  user goes to homepage
     And    user accept cookies
     And    user search for "women bags"
     And    user select the first option
     And    user add item to the Cart
     And    user goes to the Cart
     And user clicks voucher button
     And user enters "qachallenge"
     When user clicks redeem button
     Then user should see discount on total price










