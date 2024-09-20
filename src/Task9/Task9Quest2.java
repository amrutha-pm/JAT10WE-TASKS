package Task9;
import java.util.Scanner;
public class Task9Quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//get string from user and reverse the string

		        Scanner myscanner = new Scanner(System.in);
		        System.out.println("enter the string");
		        String str = myscanner.nextLine();
myscanner.close();
		        for (int i=0;i<str.length();i++) {

		            //System.out.print(str.charAt(i));
		            System.out.print(str.charAt(str.length()-i-1));
	}

}}
