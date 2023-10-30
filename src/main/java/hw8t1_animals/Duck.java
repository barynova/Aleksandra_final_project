package hw8t1_animals;

public class Duck extends ExoticBird{
    public Duck(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("Quack");
    }
    @Override
    public void fly() {
        System.out.println("Wshuh-Wshuh");
    }}
