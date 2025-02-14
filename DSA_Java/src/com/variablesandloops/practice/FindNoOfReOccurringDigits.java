package com.variablesandloops.practice;

import java.util.Scanner;

public class FindNoOfReOccurringDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = in.nextInt();
		int count =0;
		System.out.println("Enter the number to find the occurrence: ");
		int k = in.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(n%10 == k)
			count = count+1;
			
			n=n/10;
		}
		System.out.println("Tne occurrence is "+count);

	}

}
