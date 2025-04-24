package Construction;

class person {
	
	String name;
	int age;
	
	person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("my name is " +name+ " and my age = "+age);
	}
}

public class Constructor_method {

	public static void main(String[] args) {

		person p1=new person("heku",28);
		person p2=new person("kumar",30);
		p1.display();
		p2.display();
	}

}
