package variablesAndloops;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     String word = in.next();
     
     char ch = word.trim().charAt(0);
     System.out.println("The ch word is :"+ch);
     
     if( ch>='a' && ch <= 'z' )
     {
    	 System.out.println("LowerCase");
     }
     
     else {System.out.println("UpperCase");}
     


	}
	
	

}
