package hw8t1_animals;

class Fish extends Inspired {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void inspire() {
        System.out.println("Boolk from " + getName());
    }

}
