package Default;
import java.util.Scanner;
public class contain {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any string:");
		String s1 = s.nextLine();
		if(s1.contains("You")) {
			System.out.println("String contains,'you'");	
		}
		else {
			System.out.println("String does not contains 'you'");
			
		}
			
		

	}

}
