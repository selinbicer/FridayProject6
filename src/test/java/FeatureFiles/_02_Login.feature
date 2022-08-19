Feature: Login feature

  Background:
    Given navigate to parabank

  Scenario Outline:Login with valid data

    When login with valid name as "<username>" and password as "<password>"
    Then "<message>" should be displayed

    Examples:
      | username | password | message           |
      | 16group  | 123456   | Accounts Overview |
      | mdhgh    | 123456   | Error!            |






