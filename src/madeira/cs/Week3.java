package madeira.cs;

import java.util.Scanner;

public class Week3 {
    public static void main(String[] args) {
        /*
            Problem I
            ---------
            Prompt the user to enter two numbers
            Compare the two numbers and print out "First" if first is greater or "Second" second is greater
            This should handle decimals and integers at a wide range of values
            */
        Scanner NUM = new Scanner(System.in);
        System.out.println("Enter the first number");
        int Num1 = NUM.nextInt();
        System.out.println("Enter the second number");
        int Num2 = NUM.nextInt();
        if (Num1 >= Num2) {
            System.out.println("First");
        }
        else {
            System.out.println("Second");
        }

        /*



            Problem II
            ----------
            Prompt the user to enter their favorite genre of music
            Reply with "Same!" if it is the same as your favorite genre or "Lame." if not.
            */
        Scanner Music = new Scanner(System.in);
        System.out.println("Enter Your Favorite Genre of Music");
        String Genre = Music.nextLine();
        if (Genre.equals("rock")) {
            System.out.println("Same!");
        }
        else {
            System.out.println("Lame.");
        }

        /*

            Problem III
            -----------
            Declare an integer, any integer.
            Prompt the user to guess your number.
            Give them 10 tries to get it right.
            If they do, present them with a congratulatory message, if not, roast them unfairly.
            */

        Scanner Game = new Scanner(System.in);
        int number = 86;
        int i, guess;
        for (i = 0; i < 10; i++) {
            System.out.println("Guess the number:");
            guess = Game.nextInt();
            if (number == guess) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            }
            else if (number != guess && i != 9) {
                System.out.println("Try it again");
            }
        }
        if (i == 10) { System.out.println("You lose");

            System.out.println("The number was " + number);
        }

        /*


            Problem IV
            ----------
            Produce the following output using one print statement

            *****
            ****
            ***
            **
            *

            */
        System.out.println("*****\n****\n***\n**\n*");
        /*

            Problem V
            ---------
            Produce the following output using one print statement

            ****
            **
            *
*/
        System.out.println("\n\n****\n**\n*");
        /*



            ------------------
            EXTRA CREDIT BELOW
            ------------------


            Problem VI
            ----------
            Declare an number, any number.
            Prompt the user to guess your number.
            Give them 10 tries to get it right.
            For each try they should either be:
                Hot: +/- 2
                Medium: +/- 4
                Mild: +/- 8
            If they are Hot they should have 4 guesses subtracted from their total remaining
            If they are Medium they should have 2 guesses subtracted from their total remaining
            If they are Mild they should have 1 guess subtracted from their total remaining

            Once they're out of guesses, they should be prompted to play again.


            Edge Cases:
            - If I have 4 guesses remaining and my guess is within 2 of the correct answer I should receive the prompt: "One more guess!"
            - Same goes for 2 guesses remaining with a Medium guess
            - User should be able to enter ANY TYPE of number

            Brownie points for well commented / organized code that goes above and beyond to direct the user clearly & leaves no room for ambiguous edge cases

        */

        Scanner NewGame = new Scanner(System.in);
        int Number = 36;
        int j, Guess;
        for (j=0;  ; ) {
            System.out.println("Guess the number:");
            Guess = NewGame.nextInt();
            if (Number == Guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (Guess <= Number +2 && Guess >= Number -2  && i != 9) {
                System.out.println("Hot");
                j+=4;
                if (j == 6) {
                    System.out.println("One more guess!");
                }
            }
            else if (Guess <= Number +4 && Guess >= Number -4  && i != 9) {
                System.out.println("Medium");
                j+=2;
                if (j == 8) {
                    System.out.println("One more guess!");
                }
            }
            else if (Guess <= Number +8 && Guess >= Number -8  && i != 9) {
                System.out.println("Mild");
                j+=1;
            }
            else {
                System.out.println("Guess again!");
            }
            if (Guess != Number && j>=10) {
                System.out.println("Play this game again");
                j=0;
            }
        }
    }
}
