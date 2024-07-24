package Default;
import java.util.Scanner;
public class MaxMinusMin {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int n=4;
		int[] A = new int[n];
		
		int min=0, max = 0;
		System.out.println("Enter the values of array:");
		for(int i=0;i<n;i++) {
			A[i] = obj.nextInt();
			
		}
		  //GetMin
       for(int i=0;i<n;i++)
       {
    	   for(int j= i+1;j<n;j++) {
    		   if(A[i]>A[j]) {
    			   min=A[j];
    		   }
    	   }
       }
       System.out.println("the min value is :"+min);
       //GetMax
         for(int i=0;i<n;i++)
         {
      	   for(int j= i+1;j<n;j++) {
      		   if(A[i]<A[j]) {
      			   max = A[j];
      			}
      	   } 
         }
      	   
         System.out.println("the max value is :"+max);
         int Res = max - min;
         System.out.println("the MaxMinusMin value is :"+Res);
	}

}
