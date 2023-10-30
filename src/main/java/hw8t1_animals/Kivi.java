package hw8t1_animals;

public class Kivi extends ExoticBird{
    public Kivi(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("Kivi-kivi. I am not a fruit");
    }
    @Override
    public void fly() {
        System.out.println("I am a fluffy bird but I can't fly");
    }}