package basic_interview_programs;

import java.util.Scanner;

public class ArmStrongNumber {

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
		
		for(int i = 0;i<length;i++)
		{
			char ch = str.trim().charAt(i);
			System.out.println("Char is"+ch);
			int k = Integer.parseInt(String.valueOf(ch));
			sum = (int) (sum+Math.pow(k, length));
			System.out.println("Sum is:"+sum);
			
		}
		System.out.println("The length is :"+length);
		if(temp == sum)
		{System.out.println("Armstrong: "+sum+"Temp is: "+temp);}
		
		else
			System.out.println("Not Armstrong"+sum+"Temp is: "+temp);

	}
}
