// Base class Animal
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }
}

// Subclass Dog inherits Animal and overrides makeSound
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();  // Calls Animal's method

        Dog dog = new Dog();
        dog.makeSound();  // Calls overridden method in Dog
    }
}

