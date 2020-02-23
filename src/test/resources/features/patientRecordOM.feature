Feature: Search patient record functionality

  @find-patient-record
  Scenario: User should be able to search by patient's name
    Given User navigates to OpenMrs login page and logged in
    Then User clicks find patient record
    And User is able to search patient record by a name

  @search-navigate
  Scenario: User should be able to search by patient's name and go to next page
    Given User navigates to OpenMrs login page and logged in
    Then User clicks find patient record
    And User is able to search patient record by a name
    Then User is able to click next on the page
    And User is able to click last on the page

  @Dashboard
  Scenario: User should be able to view patient dashboard
    Given User navigates to OpenMrs login page and logged in
    Then User clicks find patient record
    And User is able to search patient record by a name
    And User clicks the searched patient's name
    Then User lands on patient dashboard

  @Dashboard-delete
  Scenario: User should be able to view patient dashboard
    Given User navigates to OpenMrs login page and logged in
    Then User clicks find patient record
    And User is able to search patient record by a name
    And User clicks the searched patient's name
    Then User lands on patient dashboard
    And User can delete patient



#  User story 4: Patient record functionality
#  ○ Scenario 1: User should be able to view patient dashboard
#  ■ search for a patient -> click on patient -> verify you're on patient
#  dashboard
#  ○ Scenario 2: User should be able to delete patient record
#  ■ search for a patient -> click on patient -> verify you're on patient
#  dashboard -> delete patient




#● User story 3: Search patient record functionality
#○ Scenario 1: User should be able to search patient record
#○ Scenario 2: User should be able to search patient record and navigate to
#the second pagination