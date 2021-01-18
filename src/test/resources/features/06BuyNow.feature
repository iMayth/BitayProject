Feature: user should be able to be on buynow page
  @e2e
  Scenario: go to buynow page
    Given the user is on the main page
    When user clicks BuyNow button
    Then the user should be able to see ödeme yöntemini seçin title
