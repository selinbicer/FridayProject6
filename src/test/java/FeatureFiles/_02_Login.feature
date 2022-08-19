Feature: Login feature

  Background:
    Given navigate to parabank

  Scenario Outline:Login with valid data

    When login with valid name as "<username>" and password as "<password>"
    Then welcome message should be displayed

    When login with invalid name as "<username>" and password as "<password>"
    Then fail message should be displayed

    Examples:
      | username | password |
      | group16  | 123456   |
      | mdhgh    | 123456   |






