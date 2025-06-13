Feature: Test Login Functionality

  Scenario Outline: Check login is succesful with valid credentials
    Given browser is open
    And User is on login page
    When User enter username as "<username>" and password as "<password>"
    And click on login
    Then User should be navigated to home page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
