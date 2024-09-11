package orientacao_objto;
public class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
    }
}