//WAP program to find Area of Circle, Rectangle and Triangle.

import java.util.Scanner;
public class Area {
        public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter shape: ");
        String shape=sc.next();

//using switch statement to determine the shape for which we want to calculate the area
      
        switch(shape){
            case  "circle" : System.out.println("Enter radii: ");
            double r=sc.nextDouble();
            double c=Math.PI*r*r;
            System.out.println("area of circle= "+c);
            break;
            case "rectangle" : System.out.println("Enter length: ");
            double l=sc.nextDouble();
            System.out.println("Enter breadth: ");
            double b=sc.nextDouble();
            double R=l*b;
            System.out.println("area of rectangle= "+R);
            break;
            case "triangle" : System.out.println("Enter base: ");
        
            double base=sc.nextDouble();
            System.out.println("Enter height: ");
            double height=sc.nextDouble();
            // System.out.println("Enter 3rd side: ");
            // double s3=sc.nextDouble();
            double t= 0.5*base*height;
            System.out.println("area of triangle= "+t);
            break;


    
        }


    }
}
