package hw8t1_animals;

class Som extends Fish {
    public Som(String name) {
        super(name);
    }

    @Override
    public void inspire() {
        System.out.println("I am a fish named " + getName());
    }
}
