Feature: user should be able to open buy/sell page
  @e2e
  Scenario: go to trade page

    When user clicks buy_sell button
    Then user should see be able to see orders