Feature: My_health funcationality


@Myhealth
Scenario: To check the my health functionality

Given Patient login using valid credentials
And patient is adding new diagnosis 
And patient is adding new medication
And patient is archiving and unarchiving the diagnosis
Then patient logout
