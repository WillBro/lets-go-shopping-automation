Feature: Buy individual tickets
  In order to save time at the station
  As a casual traveller
  I want to be able to buy train tickets online

  Scenario: Tracy wants to travel from London to York for a festival
    Given that Tracy has decided to check available tickets
    When she looks at a trip from London to York leaving tomorrow
    Then she should be shown the cheapest single ticket price from London to York

  Scenario: Bill wants to travel from London to Birmingham for a work trip
    Given that Bill has decided to check available tickets
    When he looks at a return trip from London to Birmingham leaving tomorrow and returning in 2 days
    Then he should be shown the cheapest return ticket price from London to Birmingham
