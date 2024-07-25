package Default;
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int [][] a= new int[2][2];
		int [][] b= new int[2][2];
		int [][]c= new int[2][2];
		System.out.println("enter the value of Matrix A");
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("enter the value of Matrix b");
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++) {
				b[i][j]=s.nextInt();
			}
		}
		System.out.println("The  value of Matrix C");
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++) {
				c[i][j]=a[i][j] + b[i][j];
				System.out.println( " "+c[i][j]);
			}
		}
	}

}
