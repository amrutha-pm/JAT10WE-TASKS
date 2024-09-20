package Task8;

import java.util.Scanner;

public class Task8Quest5 {

	public static void main(String[] args) {// TODO Auto-generated method stub
int i,m=0,flag=0;
System.out.println("Enter a number :");
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
sc.close();
m=n/2;
if(n==0||n==1) {
	System.out.println(  n  +  "  is not a prime number");

}       //To find the number is prime or not,Prime number is a number that is greater than 1 and divided by 1 or itself only.ie,prime numbers cannot be divided by other numbers than itself or 1.
		//examples are 2.3,5,7,11,13,17 etc.2 is the only even prime number bcoz all other evn numbers are divided by 2
else
{
	for(i=2;i<=m;i++)
	{
		if(n%i==0) {
			System.out.println(n+ "is not prime number" );
			flag = 1;
			break;
		}
}
	if(flag==0)
	{
		System.out.println(n + "is prime number");
	}
}}}
