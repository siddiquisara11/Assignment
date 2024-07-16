//Write a program to display a greeting message according to the percentage obtained by students.

import java.util.Scanner;
public class GreetingByPercentage {
    public static void main(String[]args){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your percentage: ");
        double p=sc.nextDouble();

        if(p<=0 || p>=100){
            System.out.println("invalid marks ");
        } else {
            // Use if-else statements to determine the grade and display a greeting message
            if (p >= 90) {
                System.out.println("Excellent work! You have achieved an A grade.");
            } else if (p >= 80) {
                System.out.println("Great job! You have achieved a B grade.");
            } else if (p >= 70) {
                System.out.println("Good effort! You have achieved a C grade.");
            } else if (p >= 60) {
                System.out.println("You passed! You have achieved a D grade.");
            } else if (p >= 35) {
                System.out.println("You just made it! You have achieved an E grade.");
            } else {
                System.out.println("Unfortunately, you did not pass. Better luck next time!");
            }
        }
    }

    
}
