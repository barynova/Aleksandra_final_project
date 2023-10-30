package hw8t1_animals;

class Karas extends Fish {
    public Karas(String name) {
        super(name);
    }

    @Override
    public void inspire() {
        System.out.println("I am not tasty fish named " + getName());
    }
}