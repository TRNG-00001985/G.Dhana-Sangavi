package Default;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		//System.out.println("Enter the array values:");
		Scanner obj = new Scanner(System.in);
		//System.out.println("Enter the array values:");
		 int n=4;
		 int[] array1 = new int[n];
		 System.out.println("Enter the array1 values:");
		 for(int i=0;i<n;i++) {
			 array1[i]=obj.nextInt();
			
		 }
		 int[] array2 = new int[n];
		 System.out.println("Enter the array2 values:");
		 for(int i=0;i<n;i++) {
			 array2[i]=obj.nextInt();
			
		 }
		int[] array3 = new int[n];
		 System.out.print("Arraysum values are:");
		 for(int i=0;i<n;i++) {
			  array3[i]=array1[i]+array2[i];
			  System.out.print(array3[i]/n );  
			
		 }
	}

}
