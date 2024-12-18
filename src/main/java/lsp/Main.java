package lsp;
public class Main {
    public static void main(String[] args) {
        // Crear instancias de animales
        Animal dog = new Dog();
        Animal fish = new Fish();

        // Mostrar información de los animales
        dog.display();
        dog.makeSound();
        ((WalkingAnimal) dog).walk(); // El perro puede caminar

        fish.display();
        fish.makeSound();
        // El pez no intenta caminar, evitando errores en tiempo de ejecución.
    }
}
