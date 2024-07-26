package Default;

public class MutipleTry extends Exception {

	public static void main(String[] args) {
		try {//outer try
			try {//inner try
			int b = 40/0;
		    }
		
		   catch(ArithmeticException e)//inner catch
		   {
			System.out.println(e);
		   }
		 A[5] = {1,2,3,4,5,6};
		for(int i=0;i<5;i++) {
         System.out.println(A[i]);	
		}
		}
		catch(Exception A)//outer catch
		{
			System.out.println(A.getMessage());
		}

}}

