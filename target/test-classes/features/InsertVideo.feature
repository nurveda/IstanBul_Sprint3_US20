Feature: Insert a video

  Background:
    Given the user logged in as "HR"
    Given the user should be on the announcement window


  @REM-877 @wip @secondPart @demo
  Scenario Outline: Insert video by regular way //tc12
    Given click "Insert Video" icon
    When enter "<videoURL>" to video source input box
    Then system should NOT display error message
    Examples:
      | videoURL                     |
      | https://youtu.be/8jTyKk8IrAo |
      | https://youtu.be/jHr7bqMi7mk |
      | https://vimeo.com/497120629  |
      | https://vimeo.com/636356307  |

  @REM-878 @wip @secondPart
  Scenario: Cancelling with cancel button //tc13
    Given click "Insert Video" icon
    Given enter "https://youtu.be/8jTyKk8IrAo" to video source input box
    When click to the "cancel" button
    Then verify entered link didn't displayed on the window


  @REM-879 @wip @secondPart
  Scenario: Closing window through cross sign //tc14
    Given click "Insert Video" icon
    When user clicks cross icon on the corner of the page
    Then verify window will not be visible


#done