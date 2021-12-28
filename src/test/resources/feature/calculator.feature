Feature:  Calc
  Scenario: Sum two numbers
    Given I have two numbers: 1 and 2
    When the calc sums them
    Then I receive 3 as a result
