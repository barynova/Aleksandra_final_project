package hw8t1;

public class BirdParadise {
    public static void main(String[] args) {
        // Створюємо птахів і викликаємо методи

        Bird orel = new Orel("Happy Orel");
        Bird leleka = new Leleka("Happy Leleka");
        Bird pigeon = new Pigeon("Happy Pigeon");

        Bird penguin = new Penguin("Happy Penguin");
        Bird kivi = new Kivi("Happy Kivi");
        Bird oistrich = new Oistrich("Happy Oistrich");
        Bird duck = new Duck("Happy Duck");

        orel.fly();
        orel.makeSound();

        leleka.fly();
        leleka.makeSound();

        pigeon.fly();
        pigeon.makeSound();

        penguin.fly();
        penguin.makeSound();

        kivi.fly();
        kivi.makeSound();

        oistrich.fly();
        oistrich.makeSound();

        duck.fly();
        duck.makeSound();
    }
}
