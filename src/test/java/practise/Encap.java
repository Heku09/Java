package practise;

class abc{
	
	private String name;
	private int age;
	
	public void setname(String name) {
		this.name=name;
	}
	public  String getname() {
		return name;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	public  int getage() {
		return age;
	}
}

public class Encap {

	public static void main(String[] args) {

		abc a=new abc();
		a.setname("heku");
		System.out.println(a.getname());
	}

}
