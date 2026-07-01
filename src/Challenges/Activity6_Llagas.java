package Challenges;

import java.util.Scanner;

public class Activity6_Llagas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double average = 0;
        int[] studentScore = new int[5];


            for (int i = 0 ; i < studentScore.length ; i++) {
                System.out.print("Enter Score for Student " + (i + 1) + ": ");
                studentScore[i] = sc.nextInt();
            }

            System.out.println("\n-----Scores Entered-----");

                for ( int i = 0 ; i < studentScore.length ; i++) {
                    System.out.println("Student Score: " + studentScore[i]);
                }

                for (int i = 0; i < studentScore.length; i++) {
                    sum += studentScore[i];
                }

            average = (double) sum / studentScore.length;

            int highest = studentScore[0];

        for (int i = 1 ; i < studentScore.length; i++){
            if (studentScore[i] > highest) {
                highest = studentScore[i];
            }
        }
                System.out.println("\nTotal Score: " + sum);
                System.out.printf("Average Score: %.1f%n", average);
                System.out.println("Highest Score: " + highest);

                sc.close();
    }
}
