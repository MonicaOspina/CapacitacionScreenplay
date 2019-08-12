#Author: monica.ospina@sophossolutions.com

@tag
Feature: Busqueda en Google
  Monica como un usuaria quiere poder entrar a google y buscar una palabra

  @somkeTest
  Scenario: Busuqeda exitosa
    Given que Monica esta en la pagina de google
    #And some other precondition
    When busca la palabra "quesito"
    #And some other action
    #And yet another action
    Then deberia ver el resultado de wikipedia
    #And check more outcomes

  #@tag2
  #Scenario Outline: Title of your scenario outline
  # Given I want to write a step with <name>
  # When I check for the <value> in step
  # Then I verify the <status> in step

  #  Examples: 
  #    | name  | value | status  |
  #    | name1 |     5 | success |
  #    | name2 |     7 | Fail    |
