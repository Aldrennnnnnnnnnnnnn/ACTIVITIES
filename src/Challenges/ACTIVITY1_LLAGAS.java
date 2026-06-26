package Challenges;

public class ACTIVITY1_LLAGAS{
    public static void main(String[] args){

        //DECLARATION OF VARIABLES
        String studentName = "Juan Dela Cruz"; //Name of the student
        int subject1 = 85;  //Student score
        int subject2 = 78;  //Student score
        int subject3 = 90;  //Student score
        int passingMark = 75; // Passing score on teach subject

        //ARITHMETIC OPERATORS
        int resultAdd = subject1 + subject2 + subject3; //Add operator to sum up all the value of each score on different subject.
        double averAge = resultAdd / 3.0; // Dividing the sum to the total number of subject.

        //RELATIONAL OPERATORS & LOGICAL OPERATORS
        //Checking if each subject is greater or equal to the passingMark
        boolean passedSubject = subject1 >= passingMark && subject2 >= passingMark && subject3 >= passingMark;
        //Checking if the average of the student is greater than or equal to 90 to be eligible for honors.
        boolean eligHonors = averAge >= 90;

        //OUTPUT
        System.out.println("Student Name: " + studentName);
        System.out.println("Subject 1 Score: " + subject1);
        System.out.println("Subject 2 Score: " + subject2);
        System.out.println("Subject 3 Score: " + subject3);
        System.out.println("Total Score: " + resultAdd);
        System.out.printf("Average Score: %.2f" , averAge); // Use of %.2f to get the desired decimal number
        System.out.println("\nPassed All Subjects? " + passedSubject); //Use of \n to prevent from displaying together with the Average Score
        System.out.println("Eligible for Honors? " + eligHonors);

        //INCREMENT AND DECREMENT
        subject1++;             //Increasing the value of subject1 by 1
        System.out.println("After Bonus in Subject 1: " + subject1);
        subject2--;             //Decreasing the value of subject2 by 1
        System.out.println("After Penalty in Subject 2: "  + subject2);

        System.out.printf("Juan Dela Cruz passed with an average of %.2f" , averAge); // Use of %.2f to get the desired decimal number
    }
}