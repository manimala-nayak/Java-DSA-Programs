package basic_interview_programs;

import java.util.Scanner;

public class ArmstrongWithInt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		
		int a = in.nextInt();
		armstrong(a);
	}
 
	static void armstrong(int a)
	{
		
		int sum =0;
		int temp =a;
		String str = Integer.toString(a);
		int length = str.length();
		System.out.println("The length is: "+length);
		int b=0;
		
		while(a>0)
		{
		 b=a%10;
		 a=a/10;
		 sum = (int) (sum+Math.pow(b, length));
		 System.out.println("Value of b is: "+b+"Value of sum is: "+sum);
		}
		
		if(temp == sum)
		{System.out.println("Armstrong");}
		
		else
			{System.out.println("Not Armstrong");

	}}
}
