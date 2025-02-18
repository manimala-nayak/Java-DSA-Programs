package methodspractice;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		int a = 10;
	    String b = "Manimala";
	    int c[] = {1,2,3,4,5,6};
        fun(a,b,c);
	}

	 static void fun(int a, String b, int ...c) {
		System.out.println("A is "+a);
		System.out.println("B is "+b);
		System.out.println("C is "+Arrays.toString(c));
	}
}
