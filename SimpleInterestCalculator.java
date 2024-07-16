import java.util.Scanner;
public class SimpleInterestCalculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principle amount:");
        double p=sc.nextDouble();

        System.out.println("enter the rate of interest:");
        double r=sc.nextDouble();

        System.out.println("enter the time (in years):");
        double t=sc.nextDouble();

        double interest = (p*r*t)/100;
        System.out.println("the simple interest is:"+interest);


    }
}
