@Regression
Feature: Login
  @Smoke
  Scenario: As an advisor I should be able to successfully login to Imposta
    Given I’m on the login page
    When I enter  valid username as "info@conslynk.com"
    Then I enter valid  password as "Yolladvisor1"
    And I click on login button
    Then I am navigated to home page
  @Smoke @LoginModule
  Scenario: As an advisor I should NOT be able to login with incorrect credentials
    Given I’m on the login page
    When I enter  valid username as "info@conslynk.com"
    Then I enter invalid  password
    And I click on login button
    Then receive an error message

  Scenario: As an advisor I should be able to successfully logout from Imposta
    Given I am successfully logged in
    Then I click on logout button
    Then I am navigated to login page

      #Scenario Outline Practice

  Scenario Outline: As an advisor I should be able to successfully search users by first name
    Given I’m on the login page
    Given I am successfully logged in
    When User clicks client tab
    And User enters client name as "<Names>"
    And User clicks search button
    Then user sees client name in results
    Examples:
      |Names         |
      |  Elnar       |
      |Kimberly        |
      |  alex      |


         #DataTable Practice #1 - with Table Headers
         #@Search
  Scenario: As an advisor I should be able to successfully search users by first name
    Given I’m on the login page
    Given I am successfully logged in
    And I see below tabs in the navigation
      |Tab Name         |
      |Documents         |
      |Users          |
      |Invitations      |
      |Clients      |
      |Leads             |


         #DataTable Practice #2 - without Table Headers
  @Search
  Scenario: As an advisor I should be able to successfully search users by first name
    Given I’m on the login page
    Given I am successfully logged in
    And I see tab names in the navigation
      |Documents         |
      |Users          |
      |Invitations      |
      |Clients      |
      |Leads             |