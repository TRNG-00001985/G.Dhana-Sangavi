package Default;

public class swapping {

	public static void main(String[] args) {
		int a= 5,b=10;
		a=a^b;
		b=a^b;
		a=b^a;
		System.out.println("the value of a is "+a);
		System.out.println("the value of b is "+b);

	}

}
