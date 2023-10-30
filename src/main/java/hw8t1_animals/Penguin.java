package hw8t1_animals;

public class Penguin extends ExoticBird{
    public Penguin(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("Io-io");
    }
    @Override
    public void fly() {
        System.out.println("I am a fluffy bird and I can't fly ;(");
    };
}
