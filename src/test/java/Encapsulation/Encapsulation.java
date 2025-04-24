package Encapsulation;

class Personenc{
	
	private String name;
	private int age;
	
	public void setname(String name) {
		this.name=name;
		
	}
	public String getname() {
		return name;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	public int getage() {
		return age;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {

		Personenc p=new Personenc();
			p.setname("Heku");
			p.setage(28);
			System.out.println(p.getname());
			System.out.println(p.getage());
		}
	}


