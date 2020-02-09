Feature: Client Management

@Client
Scenario: As Advisor I should get warning messaged
  Given I'm on the login page
  Given I'm successfully logged in
  And I click on Clients tab
  Then I click on edit link a record
  And I click on save without changing anything
  Then I should get 7 required fields warning message