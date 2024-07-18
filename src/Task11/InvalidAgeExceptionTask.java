package Task11;

import java.util.Scanner;

public class InvalidAgeExceptionTask extends Exception {
    // using parametrised constrctor to set the title
    public InvalidAgeExceptionTask(String expmesge){
        super(expmesge);
    }
    public static void ageException() throws InvalidAgeExceptionTask{
        System.out.println("please enter the age of the user");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("entered age is valid");
        }else{
            throw new InvalidAgeExceptionTask("invalid age exception");
        }
    }
    public static void main(String[] args) {
        try {
            ageException();
        } catch (InvalidAgeExceptionTask e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            // System.out.println(e.);

        }
    }

    
}