//Write a program to display a greeting message according to the percentage obtained by students.
import java.util.Scanner;
public class GreetingByMarks {
    public static void main(String[]args){ 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks: ");
        double m=sc.nextDouble();

        if(m<=0 || m>=100){
            System.out.println("invalid marks ");
        } else {
            // Use if-else statements to determine the grade and display a greeting message
            if (m >= 90) {
                System.out.println("Excellent work! You have achieved an A grade.");
            } else if (m >= 80) {
                System.out.println("Great job! You have achieved a B grade.");
            } else if (m >= 70) {
                System.out.println("Good effort! You have achieved a C grade.");
            } else if (m >= 60) {
                System.out.println("You passed! You have achieved a D grade.");
            } else if (m >= 35) {
                System.out.println("You just made it! You have achieved an E grade.");
            } else {
                System.out.println("Unfortunately, you did not pass. Better luck next time!");
            }
        }
    }

    
}
