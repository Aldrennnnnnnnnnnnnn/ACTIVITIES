package Challenges;

import java.util.Scanner;                       //Utility for scanner

public class Activity3_LLAGAS {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int snackPrice; //Stores the price of the selected snack
        int snackChoice; //Stores the user's menu choice

        System.out.println("\n------Snack Menu------"); //Display the choices
        System.out.println("1. Burger - ₱50");
        System.out.println("2. Fries - ₱40");
        System.out.println("3. Soda - ₱20");
        System.out.println("4. Ice cream - ₱35");

        System.out.print("\nEnter your choice: "); //Accepting user input
        snackChoice = sc.nextInt();

        switch(snackChoice){                                //Use of switch case statement
            case 1:                                         //if user choose 1, it prints the burger and it's price.
                System.out.println("\nYou chose: Burger");
                System.out.println("Price: ₱50");
                break;                                      //break
            case 2:
                System.out.println("\nYou chose: Fries");   //if user choose 2 it prints the Fries and it's price.
                System.out.println("Price: ₱40");
                break;
            case 3:
                System.out.println("\nYou chose: Soda");    //if user choose 3 it prints the Soda and it's price.
                System.out.println("Price: ₱20");
                break;
            case 4:
                System.out.println("\nYou chose: Ice cream");   //if user choose 4 it prints the Ice cream and it's price.
                System.out.println("Price: ₱35");
                break;
            default:
                System.out.println("\nInvalid choice");     //Displays an error message if the user enters an invalid menu option.
        }
    }
}
