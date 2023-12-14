Feature: Questionnaires functionality


@Questionnaire
  Scenario: To check the Questionnaires functionality 
   Given user is logging in with valid credentials
    And user is clicking the questionnaire and clicking create new
    And user is entering data for every question
    Then user is saving the questionnaire in draft and checking edit and submit approval
    