package Task8;

public class Task8Quest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //To find the factorial of a given number
		int num = 5,i=1;
		long factorial = 1;
		while(i<= num)
{
	factorial *=i;
i++;
}
System.out.printf("Faactorial of %d = %d",num , factorial);
	}

}
