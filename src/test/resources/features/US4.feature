@us4
Feature: As a user, I should be able to access to Files module.

  Background:
    Given user on the dashboard page

  Scenario: verify users can access to Files module
    When the user clicks the "Files" module
    Then verify the page title is "Files - Trycloud QA.”
    And user click the top-left checkbox of the table
    Then verify all the files are selected
