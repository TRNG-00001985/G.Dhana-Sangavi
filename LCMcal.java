package Default;
import java.util.Scanner;

public class LCMcal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st number");
		int n1=s.nextInt();
		System.out.println("enter 2nd number");
		int n2=s.nextInt();
		int lcm=lcm(n1,n2);
		System.out.println("lcm of n1 and n2 is :"+lcm);

	}
 public static int lcm(int a , int b) {
	
	return ((a*b)/gcd(a,b));
	
}
public static int gcd( int a,int b) {
	while(b!= 0 ) {
		int temp = b;
		b =a%b;
		a= temp;
	}
	return a;
}
}
