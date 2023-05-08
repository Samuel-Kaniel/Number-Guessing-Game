package com.samuel.project.Project_1;


import java.util.Scanner;

// Create two class for the Guesser and Player
class Guesser {
    int guessNum;
    public int guessNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Guess the Number: ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player {

    int playerGueNum;

    public int playerGuessNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Player! Guess the Number: ");
        playerGueNum = sc.nextInt();
        return playerGueNum;
    }
}

class Empire {

    int guessNumberfromGuesser;
    int player1;
    int player2;
    int player3;

//    collect the input-numbers from the guesser
    public void collectFromGuesser()
    {
        Guesser g1 = new Guesser();
        guessNumberfromGuesser = g1.guessNumber();
    }


    //collect the input-numbers from the player
    public void collectFromPlayer()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        player1 = p1.playerGuessNumber();
        player2 = p2.playerGuessNumber();
        player3 = p3.playerGuessNumber();
    }

//    
    void compareTheNumbers()
    {
        if(guessNumberfromGuesser == player1)
        {
            if(guessNumberfromGuesser == player2 && guessNumberfromGuesser == player3)
            {
                System.out.println("All the players guessed the right number, All the players won the game!!!");
            }
            else if (guessNumberfromGuesser == player2)
            {
                System.out.println("Player 1 and Player 2 are won the game!!!");
            }
            else if(guessNumberfromGuesser == player3)
            {
                System.out.println("Player 1 and Player 3 are won the game!!!");
            }
            else {
                System.out.println("Player 1 guessed the right number, Player1 won the Game.");
            }
        }

        else if (guessNumberfromGuesser == player2)
        {
            if (guessNumberfromGuesser == player3)
            {
                System.out.println("Player 2 and Player 3 are won the game!!!");
            }
            else
            {
                System.out.println("Player 2 guessed the right number, Player 2 won the Game.");
            }
        } else if (guessNumberfromGuesser == player3) {
            System.out.println("Player 3 guessed the right number, Player 3 won the Game.");

        }
        else {
            System.out.println("All the players lost the Game. Try again!!!");
        }
    }
}
public class LanuchGame {
    public static void main(String[] args) {

        System.out.println("Game Started.");

        Empire em = new Empire();
        em.collectFromGuesser();
        em.collectFromPlayer();
        em.compareTheNumbers();
        System.out.println("Game Ended");

    }
}
