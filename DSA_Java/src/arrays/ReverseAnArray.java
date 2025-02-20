package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array values: ");
		for(int i =0;i<arr.length;i++)
		{
			arr[i] = in.nextInt();
		}
		
		reverse(arr);

	}

	 static void reverse(int[] arr) {
		 int temp = 0;
		 System.out.println("Before reversal: "+Arrays.toString(arr));
		 int i =0;
			int j = arr.length -1;
		if(arr.length%2 == 0)
		{
			while( j> i)
			{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
					i++;
					j--;
			}
		}
		
		else
		{

			while( j>= i)
			{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
					i++;
					j--;
			}
		
		}
		System.out.println("After reversal: "+Arrays.toString(arr));
	}

}
