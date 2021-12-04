
Feature: Provide pre-condition steps

  Scenario Outline: Login as a "<userType>"
    When the user logged in as "<userType>"
    Examples:
      | userType  |
      | HR        |
      | Marketing |
      | Help Desk |




#  done

#
#  Scenario: Be on the announcement part
#    Given the user logged in as "HR"
#    When user clicks more tab
#    And clicks Announcement option
#    Then Announcement window should be displayed
#
#
#  Scenario: Be on the announcement part
#    Given the user logged in as "Marketing"
#    When user clicks more tab
#    And clicks Announcement option
#    Then Announcement window should be displayed
#
#
#
#  Scenario: Be on the announcement part
#    Given the user logged in as "Help Desk"
#    When user clicks more tab
#    And clicks Announcement option
#    Then Announcement window should be displayed
