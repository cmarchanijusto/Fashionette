@login
Feature: Users should be able to login


  Scenario: Login as a customer

    Given the user is on the login page
    When the user enters their credentials
    Then the user should be able to login