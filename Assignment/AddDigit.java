//WAP to find sum of digits of entered number.

import java.util.Scanner;
public class AddDigit {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,no,r,sum=0;
		System.out.println("enter a number:");
		no=sc.nextInt();
		n=no;
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("addition of the digits of "+no+" is "+sum);
	}

}
