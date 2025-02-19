package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrintStars2D {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String star = in.nextLine();
		
		String arr[][] = new String[3][3];
		for(int row =0;row<arr.length;row++)
		{
			//to print the columns
			for(int col=0;col<arr[row].length;col++)
			{
				//System.out.println("Row is "+row+"Col is "+col);
				if((row == 0 && col == 1) || row == 2 && col == 1)
					arr[row][col]=" ";
				
				else
					arr[row][col] = star;
			}
		}

		 for (int i = 0; i < arr.length; i++) {  // Iterate over rows
	            for (int j = 0; j < arr[i].length; j++) { // Iterate over columns
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	}}

}
