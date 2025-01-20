package exercises.chapter4;

import java.util.Random;
import java.util.Scanner;

/*
 * The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 * Roll the die for the user and advance the user that number of spaces on the game board.
 * After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
 * Repeat this 4 additional times for 5 rolls in total.
 * However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
 * If they are greater than or less than 20 spaces exactly, they lose.
 */
public class RollTheDieGame {
    public static void main(String[] args) {

        int boardSpaces = 20;       //variable that holds the total number of board spaces.
        int spacesToGo = 20;         //variable that holds left spaces on the board to go
        int travelledSpaces = 0;    //variable that holds the total travelled spaces.
        int maxRolls = 5;           //variable that holds the maximum numbers of rolls.
        boolean again = false;


        //Creates a new Random object to generate random numbers
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Welcome to Roll the Die! Let's begin...");
            spacesToGo = 20;
            travelledSpaces = 0;

            for (int i = 1; i <= maxRolls; i++) {
                // Generates a random number between 1 and 6
                int die = random.nextInt(6) + 1;

                //calculate how many spaces are travelled by the user on the board
                travelledSpaces += die;

                //Print the roll number and the number you have got from the die
                System.out.printf("Roll #%d: You have Rolled a %d. ", i, die);


                if (travelledSpaces == boardSpaces) {
                    System.out.print("You're on space " + travelledSpaces + ". Congrats, you win!");
                    break;
                } else if (travelledSpaces > boardSpaces) {
                    System.out.print("Unfortunately, that takes you past " + boardSpaces + " spaces. You lose!");
                    break;
                } else if (i == maxRolls && travelledSpaces < boardSpaces) {
                    System.out.println("You're on space " + travelledSpaces + ".");
                    System.out.println("Unfortunately, you didn't make it to all " +
                            boardSpaces + " spaces. You lose!");
                } else {
                    //Calculate the left spaces on the board
                    spacesToGo = boardSpaces - travelledSpaces;
                    System.out.printf("You are now on space %d and have %d more to go%n", travelledSpaces, spacesToGo);
                }
            }
            System.out.println("\n Do you want to play again??? true --> continue, false --> exit");
            again = scanner.nextBoolean();
        }while(again);
            scanner.close();


    }
}
