Feature: get counting of question
 Scenario: I want to  check that user can open worksheet page

  Given Nagwa website Opened
  When user select language
  And search for lessons with “addition” keyword
  Then click on 2nd link from list with all lessons which match this name
  And click on preview button to display worksheet page
  Then  getting count of questions
