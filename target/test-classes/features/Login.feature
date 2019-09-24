Feature: Application Login

  Scenario: Homepage default login
    Given User is on landing page
    When User login into application with username and password
    Then Homepage is populated
    And Cards are displayed

