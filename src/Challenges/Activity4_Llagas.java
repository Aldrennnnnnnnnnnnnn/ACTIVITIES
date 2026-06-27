package Challenges;

import java.util.Scanner; //Utility for scanner or user input
import java.util.Random;  //Utility to generate random number

public class Activity4_Llagas{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess = 0; // Stores the user guess
        int attempt = 0;   // Stores the user attempt number
        int ranDom = random.nextInt(1, 11); // Generates a random number from 1 to 10


        System.out.println("------ Guess the number Game ------");  //Display the game name

        while(guess != ranDom){ // Continues to loop until the user guess the correct number
            System.out.print("Enter your guess from 1-10: "); //Accepts user input
                guess = scanner.nextInt();

                attempt++; // Increment the number of attempt

                if (guess > ranDom){                // Informs the user that the guess is higher than the target number
                    System.out.println("Too high");
                } else if(guess < ranDom){          // Informs the user that the guess is lower than the target number
                    System.out.println("Too low");
                }else {
                    System.out.println("You've Won");// Informs the user when the correct number is guessed
                }
        }
        System.out.println("Number of attempt/s: " + attempt); //Display the number of attempt
        scanner.close();
    }
}
