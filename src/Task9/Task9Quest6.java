package Task9;
import java.util.Scanner;
public class Task9Quest6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a program to calculate the hotel tariff
		        System.out.println("enter any month");
		         Scanner myscanner = new Scanner(System.in);
		        System.out.println("enter any number which denotes room rent per day");
		        System.out.println("enter no of days stayed in hotel");
		        int month = myscanner.nextInt();
		        float rent = myscanner.nextFloat();
		        int days = myscanner.nextInt();
		        float tariff;
		        myscanner.close();
		   switch (month) {
		    case 4,5,6,11,12:
		        // calculating tariff for peak seasons
		        tariff= (days*rent*1.2f);
		         break;
		    default:
		    //calculating tariff for normal seasons

		    tariff= (days*rent);
		        break;
		   }
		System.out.println(String.format("%.2f", tariff));
		    }
}

