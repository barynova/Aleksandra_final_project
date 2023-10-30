package hw8t1_animals;

class Hamster extends Pet {
    public Hamster(String name) {
        super(name);
    }

    @Override
    public void inspire() {
        System.out.println("Hamster " + getName());
    }
}