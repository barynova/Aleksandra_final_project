package hw8t1_animals;

class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void inspire() {
        System.out.println("Lazy Cat named " + getName());
    }
}
