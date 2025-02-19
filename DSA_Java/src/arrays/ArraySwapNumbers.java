package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwapNumbers {

	public static void main(String[] args) {
		/*
		 * ArraySwapNumbers ab = new ArraySwapNumbers(); System.out.println(ab);
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first index: ");
		int index1 = in.nextInt();
		System.out.println("Enter second index: ");
		int index2 = in.nextInt();
		int[] arr = {1,8,4,10,56,23};
		swap(index1,index2,arr);
		System.out.println(in.toString());
        in.close();
        System.out.println(in.toString());
	}

	  static void swap(int index1, int index2, int[] arr) {
		int temp = 0;
		System.out.println("The first array");
		System.out.println(Arrays.toString(arr));
		
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2]=temp;
		
		System.out.println("The second array");
		System.out.println(Arrays.toString(arr));
		
	}

	
}
