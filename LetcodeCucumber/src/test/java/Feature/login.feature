Feature: 
  Bookcart application Demo

  Scenario: 
    Login should be success

    Given User should navigate to the application
    And User clicks on the Login link
    And User Enter the username as ortoni
    And User Enter the password as pass1234
    When User click the login button
    Then Login should be success

  #Scenario: 
    #Login should fail
#
    #Given User should navigate to the application
    #And User clicks on the Login link
    #And User Enter the username as ortoni
    #And User Enter the password as pass1234
    #When User click the login button
    #Then Login should be failed
