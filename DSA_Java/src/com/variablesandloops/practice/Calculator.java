package com.variablesandloops.practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = in.nextInt();
		System.out.println("Enter second number: ");
		int num2 = in.nextInt();
		int ans = 0;
		System.out.println("Enter the operator: ");
		char op = in.next().trim().charAt(0);
		
			switch(op) {
			
			case '*':
			ans = num1*num2;
			break;
			
			case '+':
				ans = num1+num2;
				break;
				
			case '-':
				ans = num1-num2;
				break;
			case '/':
				if(num2!=0)
					ans = num1/num2;
				else
					System.out.println("Cannot divide by zero");
				break;
			case '%':
				if(num2!=0)
					ans = num1%num2;
				else
					System.out.println("Cannot divide by zero");
				break;
				default:
					System.out.println("Enter a valid operator");
					break;
			
		}
			System.out.println("The answer is :"+ans);
	
	}

}
