Feature: Quote text icon

  Background:
    Given the user logged in as "HR"
    Given the user should be on the announcement window

  @REM-880 @wip @firstPart
  Scenario: check if yellow quote is exist //tc15
    When click "Quote Text" icon
    Then verify the system displayed yellow quote input box inside the announcement window

  @REM-881 @wip @firstPart
  Scenario Outline: quoting a text //tc16
    When click "Quote Text" icon
    And enter "<text>" to yellow quote input box
    Then verify "<text>" is visible on the window
    Examples:
      | text                   |
      | EU6_group3 is the best |
      | 123456789              |
      | ___________________    |
      | *+/-+/+*-+/+*-+/*-+*+* |

  @REM-882 @wip @firstPart @look
  Scenario: Removing yellow quote from the window //tc17
    Given click "Quote Text" icon
    Then verify the system displayed yellow quote input box inside the announcement window
    And user enters "oooo" to yellow quote input box
    Then delete text and yellow quote input box
    Then verify window is empty


#done



#  Scenario Outline: creating nested quote
#    When click "Quote Text" icon
#    And enter "<text1>" to yellow quote input box
#    And click somewhere on the page
#    And click "Quote Text" icon
#    And enter "<text2>" to yellow quote input box
#    Then verify "<text1>" and "<text2>" is visible on the window
#    Examples:
#      | text1      | text2     |
#      | EU6_group3 | IstanBul  |
#      | is         | sprint3   |
#      | the        | is        |
#      | best       | wonderful |

