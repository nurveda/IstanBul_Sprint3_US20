Feature: Adding mention


  Background:
    Given the user logged in as "HR"
    Given the user should be on the announcement window

  @REM-883 @wip @firstPart
  Scenario: verifying expected environment //tc18
    Given click "Add Mention" icon
    Then add mention window is displayed
    And  inside the window There are no items message is displayed
    And  Recent, Employees and departments options are visible

  @REM-884 @wip @firstPart
  Scenario Outline: Adding mention //tc19
    Given click "Add Mention" icon
    When click to Employees and departments part
    And  select "<user>"
    Then "<user>" should display on the window
    Examples:
      | user        |
      | helpdesk22  |
      | hr76        |
      | marketing6  |

  @REM-885 @wip @firstPart
  Scenario: Delete the mention user //tc20
      Given click "Add Mention" icon
      Given click to Employees and departments part
      And  select "helpdesk76"
      And "helpdesk76" should display on the window
      When delete mentioned user from the announcement window
      Then verify mentioned user deleted from the window

#done


