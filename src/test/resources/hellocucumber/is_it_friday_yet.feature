@AllRun
Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  @Sele @Stars
  Scenario: Finding some cheese
    * I am on the Google search page
    * I search for "Cheese!"
    * the page title should start with "cheese"

  @Hicups
  Scenario Outline: Today is or is not Friday
    * today is <day>
    * I ask whether it's Friday yet
    * I should be told <answer>

    Examples: 
      | day              | answer |
      | "Sunday"         | "Nope" |
      | "Friday"         | "TGIF" |
      | "Anything else!" | "Nope" |

  Scenario: This is to close the browser
    * Close the browser
