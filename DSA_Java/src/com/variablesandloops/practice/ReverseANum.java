package com.variablesandloops.practice;

import java.util.Scanner;

public class ReverseANum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int rem =0;
		int ans = 0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			ans = (ans*10)+rem;
		}
		System.out.println("Reverse is: "+ans);
		

	}

}
