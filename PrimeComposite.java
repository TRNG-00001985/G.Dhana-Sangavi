package Default;
import java.util.Scanner;

public class PrimeComposite {
public static void main(String args[])
{
	System.out.println("enter a number");
	Scanner obj =  new Scanner(System.in);
	int n = obj.nextInt();
	int count =0;
	for(int i =0;i<n;i++)
	{
		if(n%i == 0)
			
		{
			count++;
		}
	}		
			if (count > 2)
			{
				System.out.println("prime number");
			}
			
	
		else
		{
			System.out.println("composite number");
	
	}
}
}
