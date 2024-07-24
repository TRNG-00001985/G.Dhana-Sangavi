package Default;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int n= 5;
		int[] A = new int[n];
		
		int sum = 0,Avg;
		System.out.println("Enter the values of array:");
		for(int i=0;i<n;i++) {
			A[i] = obj.nextInt();
			
		}
		  //average:
       for(int i=0;i<n;i++)
       {
    	   for(int j= i+1;j<n;j++) {
    	   sum = A[i]+A[j];
       }}
       Avg = sum/n;
       System.out.println("Average of array:"+Avg);
	}

}
