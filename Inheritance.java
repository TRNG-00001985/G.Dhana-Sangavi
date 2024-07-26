package Default;
class sum{
	private int b;
	private int a;

	public  void add(int a ,int b) {
		this.a=a;
		this.b=b;
		int c = a+b;
		 System.out.println(c);
	}
	
}
class diff extends sum{
	public void sub(int a, int b) {
		this.add(a, b);
		int d = a-b;
		System.out.println(d);
	
	}
	
}
public class Inheritance {

	public static void main(String[] args) {
		diff obj =new diff();
		obj.add(10,5);
		obj.sub(10, 5);
		// TODO Auto-generated method stub

	}

}
