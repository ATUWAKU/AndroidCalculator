Feature: Basic math operations with the android calculator
  As a candidate I want to automate the basic operations
  of the calculator to present my technical challenge

  Scenario Outline:do the basic operations of the android calculator
  Given the user opens the calculator
  When he enter the numbers and the operation
    | firstNumber   | sing   | secondNumber   |
    | <firstNumber> | <sing> | <secondNumber> |
  Then validate that the result is
    | result   |
    | <result> |

Examples:
  | firstNumber | sing | secondNumber | result |
  |1            |+     |2             |3       |
  |4            |-     |5             |-1      |
  |6            |*     |7             |42      |
  |18           |/     |9             |2       |

