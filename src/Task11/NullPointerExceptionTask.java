package Task11;
//import java.io.*;
public class NullPointerExceptionTask  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/// NULL POINTER EXCEPTION
		try {   //try block should always be followed by either catch or finally block
		//it will display the e xceptions that might be occur
			//we will not able to continu ewith the program
			//jvm checks exception is present or not other wise default exception workfs
		 String a=null;
		System.out.println(a.charAt(0)); //Null string,there is no character in 0 index so we hav eto catch it
		}
		catch(NullPointerException e)
		{
			//custom message ,ie,own message
			//System.out.println("good morning");
		}
		System.out.println("Null pointer Exception Cought"); 
		System.out.println("good morning");
		
		}
	}


