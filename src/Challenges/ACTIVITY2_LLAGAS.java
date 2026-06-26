package Challenges;

import java.util.Scanner;
public class ACTIVITY2_LLAGAS {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String name;        //Declaration of variables
        int age;            //Declaration of variables
        String ticketPrice;       //Declaration of variables

        System.out.println("=========INPUT=========");

        System.out.print("Enter customer name: "); //Customer name input
        name = sc.next();                      //Accepts customer input

        System.out.print("Enter age: ");           //Customer name input
        age = sc.nextInt();                    //Accepts age input

        if(age < 1){ // Checks if the customer does not meet the minimum age requirement
            System.out.println("Invalid age requirements"); // Displays an error message
        }
        else {          // Continues the program if the age is valid
            if (age >= 1 && age <= 4) {          // Check if the age is below 5 years old: Free ticket
                ticketPrice = "Free";
            } else if (age >= 5 && age <= 12) {  // Check if the age is within the range of 5–12 years old: ₱100 ticket
                ticketPrice = "₱100";
            } else if (age >= 13 && age <= 59) { // Check if the age is within the range of 13-59 years old: ₱200 ticket
                ticketPrice = "₱200";
            } else {                            // Senior citizens (60 and above): ₱150 ticket
                ticketPrice = "₱150";
            }
            System.out.println("=========OUTPUT=========");
            System.out.println("Customer name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ticket Price: " + ticketPrice);
        }
    }
}
