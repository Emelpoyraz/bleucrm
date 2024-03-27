
@wip
Feature: Default


  Scenario Outline: Verify user sees 'All employees' selected as default
    When the user logged in as "<userType>"
    And the user clicks on the Poll tab
    Then the user should see All employees by default as Recipient

    Examples:
      | userType  |
      | hr        |
      | help desk |
      | marketing |


  Scenario Outline: Verify user creates a poll by adding questions and multiple answers

    When the user logged in as "<userType>"
    And the user clicks on the Poll tab
    And the user enters the message title below
      | This is a message title |
    Then the user adds the question below
      | What is more important? |
    Then the user adds the answer below
      | Java |
    And the user clicks on add question button
    Then the user adds the question below
      | Who is not important? |
    Then the user adds the answer below
      | Python |
    Then the user clicks on the Send button

    Examples:
      | userType  |
      | hr        |
      | help desk |
      | marketing |


  Scenario Outline: Verify user selects “Allow multiple choice” checkbox

    When the user logged in as "<userType>"
    And the user clicks on the Poll tab
    And the user enters the message title below
      | This is a message title |
    Then the user adds the question below
      | What is more important? |
    Then the user adds the answer below
      | Java |
    And the user clicks on Allow multiple choice button
    And the user clicks on add question button
    Then the user adds the question below
      | Who is not important? |
    Then the user adds the answer below
      | Python |
    Then the user clicks on the Send button

    Examples:
      | userType  |
      | hr        |
      | help desk |
      | marketing |


  Scenario Outline:Verify if user can creates a poll without specifying message title

    When the user logged in as "<userType>"
    And the user clicks on the Poll tab
    And the user does not enters a message title
    Then the user adds the question below
      | What is more important? |
    Then the user adds the answer below
      | Java |
    Then the user clicks on the Send button
    Then the error message below should be displayed
      | The message title is not specified |

    Examples:
      | userType  |
      | hr        |
      | help desk |
      | marketing |


  Scenario Outline:Attempt to create a poll without specifying recipient

    When the user logged in as "<userType>"
    And the user clicks on the Poll tab
    And the user enters the message title below
      | This is a message title |
    Then the user adds the question below
      | What is more important? |
    Then the user adds the answer below
      | Java |
    And the user does not choose a recipient
    Then the user clicks on the Send button
    Then the error message below should be displayed
      | Please specify at least one person. |

    Examples:
      | userType  |
      | hr        |
      | help desk |
      | marketing |



  Scenario Outline:Attempt to create a poll without specifying an answer

    When the user logged in as "<userType>"
    And the user clicks on the Poll tab
    And the user enters the message title below
      | This is a message title.. |
    And the user enters a "a random text"
    And the user does not enter an answer
    And the user clicks on the Send button
    Then an error message below should be displayed
      | The question "a random text" has no answers. |

    Examples:
      | userType  |
      | hr        |
      | help desk |
      | marketing |


  Scenario Outline:Attempt to create a poll without specifying an question

    When the user logged in as "<userType>"
    And the user clicks on the Poll tab
    And the user enters the message title below
      | This is a message title... |
    And the user does not enter a question
    Then the user adds the answer below
      | Java |
    Then the user clicks on the Send button
    Then the error message below should be displayed
      | The question text is not specified. |

    Examples:
      | userType  |
      | hr        |
      | help desk |
      | marketing |