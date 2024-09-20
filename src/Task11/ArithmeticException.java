
		// TODO Auto-generated method

		//exce[tions and errors are subclasses are throwable class

				//Throwable is the inbuilt class in java,which is the top class for exceptions.
				//it is a super/parent class

		//subclasses--exception class and error classs
				//exception class- have 2 types=

				//checked exception/complile time exception--while writing itself it will throw errors
				//eg,IOException,SQLException,FileNotFoundException

				//  unchecked exception-The compiler will not check these exceptions at compile time-it will directly throew the error during run time
				//   EG:ArithmeticException,NullPointerException,ArrayStoreException,ArrayIndexOutOfBound

		//error-virtual machine errors,memory leak-these cannt be resolved by java

				//how do we output the information about the exception
				//methods to print the exception information
				// 1.printStackTrace

		/* ARITHMETIC EXCEPTION
		 */
	package Task11;
	import java.util.Scanner;
public class ArithmeticException {

	public static void main(String[] args) {

		        int a;
		        int b;
		        int c;
		        Scanner scanner=new Scanner(System.in);
		        System.out.println("enter the values of a and b");
		        a =scanner.nextInt();
		        b =scanner.nextInt();
		        try {
		            c=a/b;
		            System.out.println(c);

		        } catch (Exception e) {
		            System.out.println("error in division"+e.getMessage());
		            System.out.println("error"+e.getClass());
		            System.out.println("error"+e.getCause());

		        }
		           System.out.println("end of program");

		    }

		}

