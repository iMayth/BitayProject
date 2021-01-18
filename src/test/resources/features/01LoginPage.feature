Feature: user should be able to login with valid credentials
@e2e
  Scenario: Go to login-page of the website
    Given the user is on the login page
    When the user enters valid credentials
    Then clicks login button
    And the user should be able to see SMS verification page
    Then the user enters SMS code and click send button


