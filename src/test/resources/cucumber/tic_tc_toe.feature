Feature: Tic Tac Toe Game

  Scenario: First move
    Given a board like this:
    |   |1|2|3|
    |1  | | | |
    |2  | | | |
    |3  | | | |
    When player X plays in row 2, column 1
    Then the board should look like this:
    |   |1|2|3|
    |1  | | | |
    |2  |X| | |
    |3  | | | |