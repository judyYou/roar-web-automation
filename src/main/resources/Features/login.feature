@somkeTest
Feature: feature to test login functionality

  #Author
  @somkeTest
  Scenario: Check login is successful with valid credentials

    Given browser is open
    And user is on ROAR login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

#  Scenario: Check login is successful with valid credentials
#            second one
#
#    Given user is on login page
#    When user enters <username> and <password>
#    And clicks on login button
#    Then user is navigated to the home page
#
#    Examples:
#      | username | password |
#      | user01   | pwd01    |
#      | user02   | pwd02    |