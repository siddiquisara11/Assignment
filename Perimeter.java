//WAP program to find perimeter of Circle, Rectangle and Triangle.

import java.util.Scanner;
public class Perimeter {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter shape: ");
        String shape=sc.next();

//using switch statement to determine the shape for which we want to calculate the perimeter

        switch(shape){
            case  "circle" : System.out.println("Enter radii: ");
            double r=sc.nextDouble();
            double c=2*Math.PI*r;
            System.out.println("perimeter of circle= "+c);
            break;
            case "rectangle" : System.out.println("Enter length: ");
            double l=sc.nextDouble();
            System.out.println("Enter breadth: ");
            double b=sc.nextDouble();
            double R=2*(l+b);
            System.out.println("perimeter of rectangle= "+R);
            break;
            case "triangle" : System.out.println("Enter 1st side: ");
            double s1=sc.nextDouble();
            System.out.println("Enter 2nd side: ");
            double s2=sc.nextDouble();
            System.out.println("Enter 3rd side: ");
            double s3=sc.nextDouble();
            double t= s1+s2+s3;
            System.out.println("perimeter of triangle= "+t);
            break;


    
        }


    }
}
