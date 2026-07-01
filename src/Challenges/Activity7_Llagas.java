package Challenges;

import java.util.Scanner;

public class Activity7_Llagas {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int choice = 0;
        double deposit = 0;
        double withdraw = 0;
        double balance = 0;

        while(choice != 4){
            System.out.println("\nBanking Program");
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
                choice = sc.nextInt();

                switch (choice){
                            case 1:
                                    System.out.println("\nCurrent balance: " + balance);
                                    break;
                            case 2:
                                    System.out.print("\nEnter deposit amount: ");
                                        deposit =  sc.nextDouble();
                                            balance = deposit (balance, deposit);
                                    System.out.println("Deposited: " + deposit);
                                    break;
                            case 3:
                                    System.out.print("\nEnter withdrawal amount: ");
                                        withdraw = sc.nextDouble();
                                            if (withdraw > balance){
                                                System.out.println("Insufficient funds!");
                                            } else {
                                                balance = withdraw(balance, withdraw);
                                                System.out.println("Withdrawn: " + withdraw);
                                            }
                                    break;
                            default:
                                    if (choice < 1 || choice > 4){
                                        System.out.println("Invalid Choice");
                                    } else {
                                        System.out.println("Thank you for using this program!");
                                    }
                }
        }
    }
    static double deposit(double balance , double deposit){
        return deposit + balance;
    }
    static double withdraw(double balance , double withdraw){
        return balance - withdraw;
    }
}
