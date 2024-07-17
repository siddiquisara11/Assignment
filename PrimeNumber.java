import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int divisors=0;

        for(int i=1;i<=n;i++){
            if(n%i=0){
                divisors++;
            }
        }

        if(divisors=2){
            System.out.print("prime number");
        } else{
            System.out.print("not a prime number");
        }
    }
}
