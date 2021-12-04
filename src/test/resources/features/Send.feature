Feature: Send an announcement

  Background:
    Given the user logged in as "HR"
    Given the user should be on the announcement window

    @REM-886 @wip @firstPart
    Scenario: Sending by regular way
    Given click "Add Mention" icon
    When click to Employees and departments part
    And  select "helpdesk22"
    Then click "save" button
    Then verify announcement sent
