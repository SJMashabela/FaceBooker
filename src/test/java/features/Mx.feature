Feature: Log into facebook
  Scenario: When we would like to log into the facebook site
    Given The browser open facebook
    When We use "sefakomashabela@gmail.com" and "letmein" as credentials
    Then Click the log in button
