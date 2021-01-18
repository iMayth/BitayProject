Feature: user should be able to be on game page
  @e2e
  Scenario: go to game page
    Given the user is on the main page
    When user clicks game button
    Then the user should be able to see Bitay Game title
