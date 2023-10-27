package hw8t1;

public class Oistrich extends ExoticBird{
    public Oistrich(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("GGg, I am dancing");
    }
    @Override
    public void fly() {
        System.out.println("I am perfect in all, but I am not flying, I am running");
    }}
