package com.variablesandloops.practice;

import java.util.Scanner;

public class FibonacciKunalKushwaha {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the nth value: ");
		int n = in.nextInt();
		int a =0;
		int b=1;
		System.out.print(a+" "+b+" ");
		int count = 2;
		while(count<=n)
		{
			int temp = b;
			b=b+a;
			a=temp;
			count++;
			System.out.print(b+ " ");
		}
		System.out.println("The nth value is: "+b);

	}

}
