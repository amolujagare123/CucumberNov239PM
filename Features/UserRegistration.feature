Feature: all user registration related scenarios

  @userReg
  Scenario: to test the functionality of submit button
    Given I am on user registration page
    When I Enter below data
      | Amol | Ujagare | amol@gmail.com | 67676776 |
    And I click on submit button
    Then User should be added

  @userEnquiry
  Scenario: to test the functionality of submit button on user enquiry page
    Given I am on user enquiry page
    When I Enter below data for equiry
      | Amol Ujagare | amol@gmail.com | 67676776 | Pune | this is an enquiry |  |
    And I click on submit button of enquiry
    Then enquiry should be submitted

  @userSubscribe
  Scenario Outline: to test the functionality of subscribe button
    Given I am on user subscription page
    When I Enter data <name> , <email> , <contact>
    And I click on subscribe button
    Then User should be subscribed

    Examples:
      | name    | email             | contact |
      | ishwar  | ishwar@email.com  | 343434  |
      | padmini | padmini@email.com | 434343  |
      | soumya  | soumya@email.com  | 4343443 |