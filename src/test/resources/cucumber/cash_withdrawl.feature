Feature: Cash Withdrawl

  Scenario: Successfully withdrawl from an account in credit
    Given I have deposited $100.00 in my account
    When I request $20.00
    Then $20.00 should be dispensed
