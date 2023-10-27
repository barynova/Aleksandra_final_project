package hw8t1;

class Pigeon extends TypicalBird {
    public Pigeon(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("Ku-ku");

    }

    @Override
    public void fly() {
        System.out.println("Psh-sh-h");
    }
}