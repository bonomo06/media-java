package orientacao_objto;

public class Uniao {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog();        // Animal reference but Dog object
        Animal myCat = new Cat();        // Animal reference but Cat object

        myAnimal.makeSound(); // Outputs: Some generic animal sound
        myDog.makeSound();    // Outputs: Woof
        myCat.makeSound();    // Outputs: Meow
    }
}