package basic_interview_programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		
		System.out.println(isPrime(a));

	}
	
	static boolean isPrime(int a)
	{
		if(a<=1)
			return false;
		
		for(int i=2;i<=a/2;i++)
			if(a%i == 0)
				return false;
		
			return true;
	}

}
