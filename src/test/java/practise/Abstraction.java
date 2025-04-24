package practise;

abstract class Animal{
	abstract void sound();
	
	void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("Dogis barking");
	}
}

public class Abstraction {

	public static void main(String[] args) {

		Dog d=new Dog();
		d.sleep();
		d.sound();
	}

}
