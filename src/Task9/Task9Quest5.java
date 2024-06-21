package Task9;
import java.util.Scanner;
public class Task9Quest5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub /Anna university grading system
		Scanner myscanner = new Scanner(System.in);
		        System.out.println("enter the value of a");
		        float a = myscanner.nextFloat();
myscanner.close();
		if(a>=100){
		    System.out.println("S");
		}
		    else if(a>=90 && a<100){
		        System.out.println("A");
		    }
		    else if(a>=80 && a<90){
		        System.out.println("B");
		    }
		    else if(a>=70 && a<80){
		        System.out.println("C");
		    }
		    else if(a>=60 && a<70){
		        System.out.println("D");
		    }
		    else if(a>=50 && a<60){
		        System.out.println("E");
		    }
		    else if(a<50){
		        System.out.println("F");
		    }
		    else{
		        System.out.println("invalid input");
		    }}    // System.out.println("invalid input");
	} // System.out.println(a>90 && a<100 ? a:+ " A");