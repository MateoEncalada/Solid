package lsp;
public class Fish extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Fish makes bubbling sounds.");
    }

    @Override
    public void display() {
        System.out.println("This is a fish.");
    }
}
