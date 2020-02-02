Feature: Client Management
  Scenario: As an advisor I should be able to successfully add client as person and verify client in table
    Given I am successfully logged in
    When I click client tab
    And I click create new client button
    And I select option 'personal'
    And I enter first name and last name in modal window
    And I populate contact person dropdown
    And I click on save button
    Then I see client in data table

  Scenario: As an advisor I should be able to successfully Add client as business and verify client in table
    Given I am successfully logged in
    When I click client tab
    And I click create new client button
    And I select option 'business'
    And I enter first name and last name in modal window
    And I populate contact person dropdown
    Then I click on save button
    Then I see client in data table
