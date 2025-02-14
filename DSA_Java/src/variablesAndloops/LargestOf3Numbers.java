package variablesAndloops;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		LargestOf3Numbers num = new LargestOf3Numbers();
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int max = num.largestNum(a, b, c);
		System.out.println("Largest is: "+max);
	}
	
	public int largestNum(int a,int b,int c)
	{
		int max = a;
		if(max<b)
		{
			max = b;
		}
		 if(max < c)
		{
			max = c;
					};
		return max;
	}

}
