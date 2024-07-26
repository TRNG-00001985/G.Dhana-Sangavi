package Default;
abstract class character{
	 String name;
     String race;
	 int level;
	  int health; 
}
public character(String name,String race,int level,int health)
{
	this.name = name;
	this. race =  race;
	this. level = level;
	this.health = 100;
}
public  void attack() {
	this.health=30;
}
public void drinkportion() {
	this.health = 50;
}
class human extends character{

	public human(String name,int level) {
		super(name, "human",level);
		public  String Specialability() {
			System.out.println(name+"uses Human's special ability");
		}
	}
	
}
class Elf extends character{
	public Elf(String name,int level) {
		super(name,"ELF",level);
		public   String Specialability() {
			System.out.println(name+"uses Elf's special ability");
		}
	}
	class Dwarf extends character{
		public   Dwarf(String name,int level) {
			super(name,"Dwarf",level);
			public  String Specialability() {
				System.out.println(name+"uses Dwarf's special ability");
			}
		}
class Hobbit extends character{
	public   Hobbit(String name,int level) {
		super(name,"Hobbit",level);
		public  String Specialability()
		{
			System.out.println(name+"uses Hobbit's special ability");	
		}
	}
}



public class LordOfRings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
