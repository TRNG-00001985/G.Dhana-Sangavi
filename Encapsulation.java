package Default;
class encapsule{
	private String Name;
	public String getName() {
		return Name;
	}
	public void SetName(String Name) {
		this.Name=Name;
		
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		encapsule e = new encapsule();
		e.SetName("Sanghavi");
		System.out.print(e.getName());

	}

}
