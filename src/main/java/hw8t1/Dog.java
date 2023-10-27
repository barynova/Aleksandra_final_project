package hw8t1;

class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void inspire() {
        System.out.println("French bulldogie " + getName());
    }
}