Feature: US13  As a user, I should be able to view the contact list.

  Background:
    Given user on the dashboard page


  @US13
  Scenario: verify users can see all the contact names on the contact list

    When the user clicks the contacts module
    Then verify the contact names are in the list