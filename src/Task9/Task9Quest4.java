package Task9;
import java.util.Scanner;
public class Task9Quest4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a program to print the * pattern as given
		          Scanner myscanner = new Scanner(System.in);
		        System.out.println("enter the value of a");
		        int a = myscanner.nextInt();
                myscanner.close();
		        for(int i=1;i<=a;i++){
		            // outer loop with 5 rows

		            for(int j=1;j<=a;j++){
		                // inner loop with 5 coloumns

		            if(i==j || i==(a-j+1))
		            // here if i1=j1...i5=j5
		            // or if i1=j5....i5=j1
		            {
		                System.out.print("*");
		            }
		            else
		            {
		                System.out.print(" ");
		            }
		        }
		        System.out.println(" ");  
		    }
		    }}
