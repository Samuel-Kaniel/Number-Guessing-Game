# Java Code for a Number Guessing Game

The code implements a simple console-based number guessing game where a guesser receive a number from the user as an input, and three players try to guess the same number. The program compares the guess of each player with the guess of the guesser and decides the winner.

`Guesser` Class: 

The `Guesser` class is responsible for receiving a number from the user as an input. it has one method, `guessNumber()`, which prompts the user to input a number and returns that number.


`Player` Class: 

The `Player` class is responsible for accepting the player's guess input. It has one method, `playerGuessNumber()`, which prompts the user to input a number and returns that number.


`Empire` Class: 

The `Empire` class collects the input numbers form the `Guesser` and `Player` classes and compares them to decide the winner. It has three instance variables for the guess number from the guesser and the guesses of each player. It also has three methods: 
  - `collectFromGuesser()`: This method creates an instance of the `Guesser` class, calls its `guessNumber()` method to get the guess number, and stores it in the `guessNumberfromGuesser` instance variable.
  - `collectFromPlayer()`: This method creates three instances of the `Player` class, calls their `playerGuessNumber()` methods to get the player's guess, and stores them in the `player1`, `player2`, and `player3` instance variables.
  - `compareTheNumbers()`: This method compares the guess number from the guesser with the guesses of each player and prints out the winner. If no one guesses the right number, it prints out that all the players lost the game.


`LanuchGame` Class

The `LanuchGame` class is the main class that starts the game. It creates an instance of the `Empire` class, calls its `collectFromGuesser()` and `collectFromPlayer()` methods to get the input numbers, and calls its `compareTheNumbers()` method to decide the winner.

N.B: The code could be improved by adding error handling for invalid user input and making the game more interactive by allowing players to enter their names and displaying the winner with their names.
