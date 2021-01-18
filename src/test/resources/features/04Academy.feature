Feature: user should be able to be on academy page
  @e2e
  Scenario: go to academy page
    Given the user is on the main page
    When user clicks Academy button
    Then the user should be able to see academy page
