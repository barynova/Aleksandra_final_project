package hw8t1_animals;

class Leleka extends TypicalBird {
    public Leleka(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("Oooorigooo");
    }
    @Override
    public void fly() {
        System.out.println("K-k-k-k");
    };
}