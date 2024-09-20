package Task8;

import java.util.Scanner;

public class Task8Quest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,z;

		//to get values for the variables scanner class will be used
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the value of a and b :");
		 a=sc.nextInt();
		// System.out.println();
		 b=sc.nextInt();
		 sc.close();

		 System.out.println("before swapping numbers are :\n " +a+"\n "+b);

		 z=a;
		 a=b;
		 b=z;

		 System.out.println("after swapping numbers are :" +a+" "+b);
		  System.out.println();

	}

}
