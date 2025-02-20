package arrays;

import java.util.Scanner;

public class MaxInArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i =0;i<arr.length;i++)
		{
			//System.out.println("Enter the array values: "+i);
			arr[i] = in.nextInt();
		}
		
		max(arr);

	}

	 static void max(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			//System.out.println("Is cide reaching here");
			if(max<arr[i]) {
				max=arr[i];}
		}
		System.out.println("The Max in the array is: "+max);
	}

}
