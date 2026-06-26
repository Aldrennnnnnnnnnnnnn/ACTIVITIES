package Challenges;

import java.util.Scanner;

public class ACTIVITY3_LLAGAS {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int snackPrice;
        int snackChoice;

        System.out.println("\n------Snack Menu------");
        System.out.println("1. Burger - ₱50");
        System.out.println("2. Fries - ₱40");
        System.out.println("3. Soda - ₱20");
        System.out.println("4. Ice cream - ₱35");

        System.out.print("\nEnter your choice: ");
        snackChoice = sc.nextInt();

        switch(snackChoice){
            case 1:
                System.out.println("\nYou chose: Burger");
                System.out.println("Price: ₱50");
                break;
            case 2:
                System.out.println("\nYou chose: Fries");
                System.out.println("Price: ₱40");
                break;
            case 3:
                System.out.println("\nYou chose: Soda");
                System.out.println("Price: ₱20");
                break;
            case 4:
                System.out.println("\nYou chose: Ice cream");
                System.out.println("Price: ₱35");
                break;
            default:
                System.out.println("\nInvalid choice");
        }
    }
}
