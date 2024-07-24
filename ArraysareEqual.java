package Default;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayareEqual {
  public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int n=4;
		int[] A = new int[n];
		System.out.println("Enter the values of arrayA:");
		for(int i=0;i<n;i++) {
			A[i] = obj.nextInt();
	    }
		int[] B = new int[n];
		System.out.println("Enter the values of arrayB:");
		for(int j=0;j<n;j++) {
			B[j] = obj.nextInt();
			
	     } 
		
      boolean res = Arrays.equals(A, B);
      if(res==true) {
    	  
      
      System.out.println("Arrays are  equal");
	  }
      else
      {
    	  System.out.println("Arrays are  not equal");	  
      }
  }
}
