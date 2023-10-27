package hw8t1;

class Hamster extends Pet {
    public Hamster(String name) {
        super(name);
    }

    @Override
    public void inspire() {
        System.out.println("Hamster " + getName());
    }
}