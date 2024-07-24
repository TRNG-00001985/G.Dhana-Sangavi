package Default;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n1 = s.nextInt();
		System.out.println("Enter a number");
		int n2 = s.nextInt();		
		System.out.println("GCD OF N1 AND N2 IS "+gcd(n1,n2));
	

	}
public static int gcd(int a ,int b)
{
	while(b!=0)
	{
		int temp = b;
		b = a%b;
		a = temp;
	
	}
	return a;
}
}
