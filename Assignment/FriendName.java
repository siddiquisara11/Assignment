//Write a program to accept the initial letter of the name & to display the friends name by using switch statements.
import java.util.Scanner;
public class FriendName {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the initial letter of your friend's name (A, B, C, or D): ");
        String initial=sc.next();

        // Use a switch statement to display the friend's name based on the initial letter
        switch (initial) {
            case "A":
                System.out.println("Your friend's name is Alice.");
                break;
            case "B":
                System.out.println("Your friend's name is Bob.");
                break;
            case "C":
                System.out.println("Your friend's name is Charlie.");
                break;
            case "D":
                System.out.println("Your friend's name is David.");
                break;
            default:
                System.out.println("No friend with that initial letter.");
                break;
        }


    }
}

