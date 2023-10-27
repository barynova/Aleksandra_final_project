package hw8t1;

class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void inspire() {
        System.out.println("Lazy Cat named " + getName());
    }
}
