//WAP program to print ODD Numbers from 1 to N.
import java.util.Scanner;
public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        // Print the odd numbers from 1 to N
        System.out.println("Odd numbers from 1 to " + N + " are:");
        for (int i = 1; i <= N; i++) {
            // Check if the number is odd
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

