Feature: Bookcart application Demo

  Background: 
    Given pre-requisite User should navigate to the application 
    And pre-requisite User clicks on the Login link

@Retest
  Scenario: Login should be success
    Given User Enter the username as "ortoniB"
    And User Enter the password as "pass1234B"
    When User click the login button
    Then Login should be success

@Retest
  Scenario: Login should fail
    Given User Enter the username as "gemniB"
    And User Enter the password as "passgem12B"
    When User click the login button
    Then Login should be failed
