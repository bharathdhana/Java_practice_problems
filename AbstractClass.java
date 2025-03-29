/*
Create an abstract class Animal with an abstract method makeSound().
Create two subclasses: Cat and Dog.
Both subclasses should implement the makeSound() method to print "Meow!" for Cat and "Bark!" for Dog.
In the main method, create objects of Cat and Dog and call the makeSound() method for both
*/

abstract class Animal {
    abstract void makeSound();
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat Meows...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog Barks...");       
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.makeSound();
        dog.makeSound();
        
    }
    
}
