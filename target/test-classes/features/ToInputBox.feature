Feature: Adding multiple contacts into "To" box

  Background:
    Given the user logged in as "HR"
    Given the user should be on the announcement window

  @REM-865 @wip @secondPart
  Scenario: Removing default option from To box //tc01
    When click the cross inside the all employees box
    Then verify all employees option is removed

  @REM-866 @wip @secondPart
  Scenario: Clicking Add persons, groups or department option into empty "To" input box //tc02
    And click the cross inside the all employees box
    When click "Add persons, groups or department" option
    Then verify if people and department parts are displayed in the new window
    And the system should displayed on the right side of the page
      | Recent                    |
      | Employees and departments |
      | E-mail users              |

  @REM-867 @wip @secondPart
  Scenario Outline: Adding contact from Employee and departments part //tc03
    And click Add More link
    When Select "Employees and departments" part
    And add "<user1>" and "<user2>" users to contact
    Then verify "<user1>" and "<user2>" users re in the input box
    Examples:
      | user1     | user2       |
      | hr12      | marketing21 |
      | hr6       | helpdesk18  |
      | helpdesk8 | marketing26 |

  @REM-868 @wip @secondPart
  Scenario: Send an announcement without adding any contact //tc04
    When click the cross inside the all employees box
    When user clicks send button
    Then user should get information message -Please specify at least one person.

  @REM-870 @wip @secondPart
  Scenario Outline: Cancel an announcement after adding contacts
    And click Add More link
    When Select "Employees and departments" part
    And add "<user1>" and "<user2>" users to contact
    And verify "<user1>" and "<user2>" users re in the input box
    Then click "cancel" button
    And full announcement window should not display anymore
    Examples:
      | user1     | user2       |
      | hr12      | marketing21 |
      | hr6       | helpdesk18  |
      | helpdesk8 | marketing26 |




#done