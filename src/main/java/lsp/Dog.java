package lsp;
public class Dog extends Animal implements WalkingAnimal {
    
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    
    public void walk() {
        System.out.println("Dog is walking.");
    }

    
    public void display() {
        System.out.println("This is a dog.");
    }
}
