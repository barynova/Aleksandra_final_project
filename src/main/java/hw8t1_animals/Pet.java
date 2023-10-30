package hw8t1_animals;

class Pet extends Inspired {
    public Pet(String name) {
        super(name);
    }

    @Override
    public void inspire() {
        System.out.println("I want to eat all the time, because I am fat " + getName());
    }

}
