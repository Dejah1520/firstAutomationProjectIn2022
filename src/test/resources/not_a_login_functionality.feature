Feature: not_a_login_functionality

  Scenario: Do not login
    Given When you on the home page
    And Enter credentials
    Then Do 50 squads
    And 20 push ups
