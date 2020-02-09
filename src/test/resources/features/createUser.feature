Feature:

  @Register
  Scenario: As an user I should be able to create an account
    Given I'm on the AP's homepage
    Then I click on Sign in button in AP
    And I enter email address to create an Account in AP
    And I click on the CREATE AN ACCOUNT button in AP
    Then I fill out all the required fields in AP
    And I click on Register button in AP
    Then my account is created
