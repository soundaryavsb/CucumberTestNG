@E2E
Feature: Matching the website Title

@Sanity @Reg
  Scenario: Google Title Check
    Given Navigate to the Google website
    When Get the Google browser Title
    Then Matching the Google Title and Get the result
    
@Reg @CleanUp
  Scenario: Bing Title Check
    Given Navigate to the Bing website
    When Get the Bing browser Title
    Then Matching the Bing Title and Get the result