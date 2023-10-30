package hw8t1_animals;

class Shuka extends Fish {
    public Shuka(String name) {
        super(name);
    }

    @Override
    public void inspire() {
        System.out.println("I am tasty fish named " + getName());
    }
}