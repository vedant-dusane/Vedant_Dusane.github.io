// Parent class (Superclass)
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animals make different sounds.");
    }
}

// Child class (Subclass)
class Dog extends Animal {
    // Overriding the method in the parent class
    @Override
    void sound() {
        System.out.println("Dogs bark.");
    }
}

// Main class to test method overriding
public class inheritance_override {
    public static void main(String[] args) {
        // Create an object of the parent class
        Animal animal = new Animal();
        animal.sound(); // Calls the parent class method

        // Create an object of the child class
        Dog dog = new Dog();
        dog.sound(); // Calls the overridden method in the child class

        // Using parent reference to child object
        Animal animalDog = new Dog();
        animalDog.sound(); // Calls the overridden method in the child class
    }
}
