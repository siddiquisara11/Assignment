//WAP to convert temperature from Fahrenheit to Celsius.

import java.util.Scanner;
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = scanner.nextDouble();
        // Convert Fahrenheit to Celsius
        double c = (f - 32) * 5 / 9;

        // Display the temperature in Celsius
        System.out.printf("Temperature in Celsius: " +c);
       
    }
}

