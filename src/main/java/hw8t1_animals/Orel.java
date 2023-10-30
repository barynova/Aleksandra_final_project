package hw8t1_animals;

class Orel extends TypicalBird {
    public Orel(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("Kurlik");

    }

    @Override
    public void fly() {
        System.out.println("Vshik-Vshik");
    }
}