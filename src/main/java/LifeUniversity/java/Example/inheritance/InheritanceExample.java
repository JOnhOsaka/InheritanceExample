package LifeUniversity.java.Example.inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the subclass
        Dog dog = new Dog();

        // Call the methods of the subclass
        dog.bark();
        dog.eat();
    }
}

// Parent class
class Animal {
    public void eat() {
        System.out.println("The animal is eating");
    }
}

// Child class
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking");
    }
}