#Author: monica.ospina@sohpossolutions.com

Feature:Vivaaerobus
  I want to use vivaaerobus for buying a flight

  Scenario: I choose a flight by vivaaerobus
    Given that Monica want to visit the page vivaaerobus 
    When she chooses a flight using vivaaerobus. Departure:"Chihuahua" and destination:"Acapulco"
    Then she compares  the flight in the screen Departure:"Chihuahua" and destination:"Acapulco"
 #@SmokeTest
 # Scenario Outline: Find Flight on Vivaaerobus
 #   Given she selects one trip
 #   When she selects departure city
 #     | cityDeparture   |
 #     | <cityDeparture> |  

 
