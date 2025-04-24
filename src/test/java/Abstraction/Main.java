package Abstraction;

abstract class Animal {
    abstract void makeSound(); // Abstract method (no implementation)

    void sleep() { // Concrete method (with implementation)
        System.out.println("Animal is sleeping...");
    }
}

class Dog extends Animal {
    void makeSound() { // Implementing abstract method
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks
        dog.sleep(); // Output: Animal is sleeping...
    }
}



