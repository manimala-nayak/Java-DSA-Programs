package variablesAndloops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	//w 1 to print fibonnaci 
	//2 - to find the nth fibonnaci word
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the nth value: ");
	int n = in.nextInt();
	int a =0;
	int c =0;
	int b=1;
	System.out.print(a+" "+b+" ");
	int count = 2;
	while(count<=n)
	{
		c = a+b;
		System.out.print(c+ " ");
		a=b;
		b=c;
		count++;
	}
	System.out.println("The nth value is: "+c);

	}
	}
