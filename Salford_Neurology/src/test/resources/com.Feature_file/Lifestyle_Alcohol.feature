Feature:Lifestyle Alcohol functionality

@LifestyleAlcohol

  Scenario:To check the Alcohol functionality 
  Given Login as Patient user
  When Navigating to MYhealth
  When Clicking Lifestyle and navigating to Alcohol tracker
  And In Alcohol tracker adding new entry
  And clikcing save button
  And Clikcing My health
  Then Navigating to Lifestyle
  