package Task8;

import java.util.Scanner;

public class Task8Quest9 {

	public static void main(String[] args) {

	// TODO Auto-generated method stub
    // to find the person is senior citizen or not
		// int age;
		Scanner sc = new Scanner(System.in);
		//sc.close();
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		sc.close();
  if(age >= 60)
  {
	  System.out.println("The person is belongs to SeniorCitizen ");

  }
  else
  {
	  System.out.println("The person is general category");
  }

	}

}
