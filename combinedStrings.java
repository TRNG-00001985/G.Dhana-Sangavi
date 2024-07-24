package Default;
import java.util.Scanner;
public class combineStrings {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = obj.nextLine(); 
		System.out.println("Enter a string");
		String s2 = obj.nextLine();
	   System.out.println("the combined string is:"+concat(s1,s2));	
	   int n = s1.length();
	   System.out.println("The word count of string is "+n);
	  
	}

	public static String concat(String a, String b) {
		String s3 = a+b;
		return s3;
	}
	}
