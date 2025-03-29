/* Crearting Class Animal and its attributes call using Object and print details - use Inheritance */

class Animal {
    public void makeSound() {
        System.out.println("Animal Sounds... ");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog Barks...");
    } 
}

public class AnimalInh {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
    }
}



    

