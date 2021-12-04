Feature: Posting link by Link icon

  Background:
    Given the user logged in as "HR"
    Given the user should be on the announcement window


  @REM-872 @wip @firstPart
  Scenario Outline: Posting linkText regular way //tc7
    Given click "Link" icon
    And enter "<linkText>" to Text input box
    And hit to the "save" button
    Then verify only "<linkText>" is displayed on the announcement window
    Examples:
      | linkText       |
      | www.google.com |
      | www.amazon.com |


  @REM-873 @wip @firstPart
  Scenario Outline: Posting linkURL regular way //tc8
    Given click "Link" icon
    And enter "<linkURL>" to Link input box
    And hit to the "save" button
    Then verify only "<linkURL>" is displayed on the announcement window
    Examples:
      | linkURL                                                                                                                                   |
      | https://youtu.be/8jTyKk8IrAo                                                                                                              |
      | https://www.google.com/search?q=eden+wake+up&oq=eden+wake+up&aqs=chrome..69i57j46i512j0i512l2j0i22i30l6.2843j0j7&sourceid=chrome&ie=UTF-8 |


  @REM-874 @wip @firstPart
  Scenario Outline: Posting linkText and LinkURL regular way //tc9
    Given click "Link" icon
    And enter "<linkText>" to Text input box
    And enter "<linkURL>" to Link input box
    And hit to the "save" button
    Then verify only "<linkText>" is displayed on the announcement window
    Examples:
      | linkText       | linkURL                                                                                                                                   |
      | www.google.com | https://youtu.be/8jTyKk8IrAo                                                                                                              |
      | www.amazon.com | https://www.google.com/search?q=eden+wake+up&oq=eden+wake+up&aqs=chrome..69i57j46i512j0i512l2j0i22i30l6.2843j0j7&sourceid=chrome&ie=UTF-8 |


  @REM-875 @wip @firstPart
  Scenario Outline: Canceling linkText //tc10
    Given click "Link" icon
    And enter "<linkText>" to Text input box
    And enter "<linkURL>" to Link input box
    And hit to the "cancel" button
    Then verify entered link didn't displayed on the window
    Examples:
      | linkText       | linkURL                                                                                                                                   |
      | www.google.com | https://youtu.be/8jTyKk8IrAo                                                                                                              |
      | www.amazon.com | https://www.google.com/search?q=eden+wake+up&oq=eden+wake+up&aqs=chrome..69i57j46i512j0i512l2j0i22i30l6.2843j0j7&sourceid=chrome&ie=UTF-8 |

  @REM-876 @wip @firstPart
  Scenario: Closing window through cross sign
      Given click "Link" icon
      When clicks cross icon button
      Then window will not be visible

#done