package Challenges;

import java.util.Scanner;
import java.util.Random;

public class ACTIVITY4_LLAGAS {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess = 0;
        int attempt = 0;
        int ranDom = random.nextInt(1, 11);


        System.out.println("------ Guess the number Game ------");

        while(guess != ranDom){
            System.out.print("Enter your guess from 1-10: ");
                guess = scanner.nextInt();

                attempt++;

                if (guess > ranDom){
                    System.out.println("Too high");
                } else if(guess < ranDom){
                    System.out.println("Too low");
                }else {
                    System.out.println("You've Won");
                }
        }
        System.out.println("Number of attempt/s: " + attempt);
        scanner.close();
    }
}
