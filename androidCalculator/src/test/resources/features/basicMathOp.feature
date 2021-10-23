Feature: Basic math operations with the android calculator
  As a candidate I want to automate the basic operations
  of the calculator to present my technical challenge

  Scenario Outline:do the basic operations of the android calculator
  Given the user opens the calculator
  When he enter the numbers and the operation
    | firstNum   | sign   | secondNum   |
    | <firstNum> | <sign> | <secondNum> |
  Then validate that the result is
    | result   |
    | <result> |

Examples:
  | firstNum    | sign | secondNum | result |
  |1            |+     |2          |4       |

