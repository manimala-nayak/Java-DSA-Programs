package methodspractice;

public class Shadowing {
   static int x = 90;
	public static void main(String[] args) {
		System.out.println("Printing first x:"+x);
		int x = 40;
		System.out.println("Printing second x:"+x);//the static value of x is getting overshadowed by the int x
		//Here while passing the parameters the variable initialized inside the block is given pref
		//since static x is already overshadowed.
		fun(x);
	}
	 static void fun(int x) {
		 //here it calls the x passed in the param
		System.out.println("The x2 inside the fun block: "+x);
		//here it called the static value of x
		System.out.println("The x inside the fun block: "+x);
		
	}

}
