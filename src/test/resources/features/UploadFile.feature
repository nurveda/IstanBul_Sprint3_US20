Feature: Upload file or pictures from local disk

Background:
Given the user logged in as "HR"
When the user should be on the announcement window

  @REM-871 @wip @firstPart
  Scenario Outline: uploading a picture from local disk //tc6
    And click Upload files icon
    When user uploaded "<fileName>" from local
    Then the system should display selected picture under the Attached files and images text
    And verify the "<fileName>" is displayed under the Attachment files and images text
       Examples:
      | fileName         |
      | example.docx     |
      | example2.pptx    |
      | example3.txt     |
      | pictureDog.jpg   |
      | picturePanda.jpg |


#done