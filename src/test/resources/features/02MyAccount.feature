Feature: user should be able to see my account page
  @e2e
  Scenario: go to my account page
    Given the user is on the my account page
    Then the title of the page should be Hesabım
    And the user should be able to see bakiye