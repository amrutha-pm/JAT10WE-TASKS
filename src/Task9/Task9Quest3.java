package Task9;
import java.util.Scanner;
public class Task9Quest3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //write a program to print the pattern as given
		
		        Scanner myscanner = new Scanner(System.in);
		        System.out.println("enter the values of a");
		        int a = myscanner.nextInt();
		        myscanner.close();
		        int x=1;
   
		        for(int i=1;i<=a;i++){
		           //System.out.println("first loop" + i +"<=" + 4 full loops);

		        //    outerloop for rows

		            for(int j=1;j<=i;j++){
		                // inner loop for colomns
		                System.out.print(x+" ");

		                x++;
		            }
		        System.out.println("");
		    }
		}
}