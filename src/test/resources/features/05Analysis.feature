Feature: user should be able to be on analysis page
  @e2e
  Scenario: go to analysis page
    Given the user is on the main page
    When user clicks Analysis button
    Then the user should be able to see teknik indikatörler title
