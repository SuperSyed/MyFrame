Feature: Client Management

@Client
Scenario: As Advisor I should get warning messaged
  Given I'm on the login page
  Given I'm successfully logged in
  And I click on Clients tab
  Then I click on edit link a record
  And I click on save without changing anything
  Then I should get 7 required fields warning message

  @excel
  Scenario: As an advisor I should be able to successfully search users by first name
    Given I'm on the login page
    Given I'm successfully logged in
    When I click on Clients tab
    And I enter client name
    And I click search button
    Then I see client name in results

  @excel-all
  Scenario:
  Then I can print all excel data


  @excel-write
  Scenario: I can write data to excel
    Then I can write data to excel

  @APCreateAcnt
  Scenario: As an user I should be able to create an account
    Given I'm on AP homepage
    Then I click on Sign in button in AP
    And I enter email address to create an Account in AP
    And I click on the CREATE AN ACCOUNT button in AP
    Then I fill out all the required fields in AP
    And I click on Register button in AP
    Then my account is created