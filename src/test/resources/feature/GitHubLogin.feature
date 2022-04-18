Feature: Login Page verify
  Scenario: User logins in successfully
    Given User is on Login Page
    When User fulfills email as "ief7wbcb@duck.com" and password as "yDRDCsNP9B5oES"
    Then User see Home Page
    And User signed in as "testUiWithSeleniumUsingTheBDDApproach"