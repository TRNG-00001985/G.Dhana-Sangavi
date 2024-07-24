package Default;
import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		System.out.println("enter your year");
		Scanner obj = new Scanner(System.in);
		
		int year = obj.nextInt();
		if(year % 4==0)
		{
			System.out.println("A leap year :"+year);
		}
		else
		{
			System.out.println("Not a leap year :"+year);
		}

	}

}
