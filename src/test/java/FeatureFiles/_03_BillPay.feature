Feature: Bill Pay Functionality

  Background:
    Given navigate to parabank
    When login with valid data

  Scenario Outline:
    When navigate to bill pay page
    Then user should fill name as "<BillName>"
    And user fill other info boxes and writes the amount "<BillAmount>"
    Then verify payment message

    Examples:
      | BillName | BillAmount |
      | Elektrik | 85         |
      | Su       | 45         |
      | Dogalgaz | 120        |