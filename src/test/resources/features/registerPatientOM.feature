Feature:

  @registerOM-male
  Scenario: User should be able to register male patient
    Given User navigates to OpenMrs login page and logged in
    Then User clicks register a patient
    And User enters Given name
    And User enters Family name
    Then User clicks "Male Option" to register as male
    Then User enters Birthdate information
    And User fills out contact information
    And User chooses relationship
    Then User confirms registration
    And User logs out

  @registerOM-female
  Scenario: User should be able to register male patient
    Given User navigates to OpenMrs login page and logged in
    Then User clicks register a patient
    And User enters Given name
    And User enters Family name
    Then User clicks "Female Option" to register as female
    Then User enters Birthdate information
    And User fills out contact information
    And User chooses relationship
    Then User confirms registration
    And User logs out












#● User story 2: Register patient record functionality
#○ Scenario 1: User should be able to register male patient
#○ Scenario 2: User should be able to register female patient