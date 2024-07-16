//WAP to swap two numbers with temp variables.

public class Swap {
    public static void main(String[]args){
        int a = 20, b = 10;
        int t=a;
        a=b;
        b=t;
        System.out.println("a= "+a+" b= "+b); 

        //WAP to swap two numbers without using temp variables.

        int x=30, y=20;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x= "+x+" y= "+y); 


    }
}

