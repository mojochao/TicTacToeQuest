# Tic Tac Toe Quest

Tic Tac Toe (T3) Quest is a game created to teach Java through
a series of progressive enhancements.

Unit tests should be created for each class during design or
implementation.

Source code should be stored in a git repository with tags for
each release.

1. Initial game

Create a 3x3 T3 game in which the computer plays itself.
The game board should be displayed after each player's move
with indicators for empty cells, as well as those for each player.
The game should check for a winner after each move, and display
the winner once found.  If the board is full, the game should
display that the game ends in a draw.  The computer should pick
a turn by choosing a random, open cell on the board.

2. Interactive game

Modify program to allow for zero, one, or two parameters to be
passed to it on the command line.  If zero arguments, the program
should run as before.  If one argument is present, that argument
should be used as the name of the starting, interactive player.
If two arguments are preset, the first argument should be used
as the name of the first interactive player, and the second used
as the name of the second interactive player.

3. Quest game

Modify program to make claiming of each cell on the board based on
the outcome of a combat phase.  Combat will be in terms of a game
of roshambo.  If the player claiming the cell beats
the opponent, the cell will become claimed.  Otherwise, the cell
remains open.

During combat phase each player will choose a hero to attack
their opponent with.  The traditional Rock, Paper, and Scissors
will be the heroes players will choose from.

4. Expanded game

Modify program to make the size of the board configurable.
Modify program to replace and extend the traditional heroes with
fantasy-themed ones.

5. Graphical game

Modify program to run as a JavaFX application, retaining all
existing functionality.

6. Persistent game

Add win-loss tracking and leaderboards to game.  Allow games to
be saved for later resume.

7. Data-driven game

Modify program to read in data describing the game setup including
board dimensions as well as heroes available.

8. Online game

Split program into a separate game client and server.

9. Intelligent game

Modify program so that the computer player uses intelligence
which choosing a cell during their turn.
