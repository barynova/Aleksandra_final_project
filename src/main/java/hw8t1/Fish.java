package hw8t1;

class Fish extends Inspired {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void inspire() {
        System.out.println("Boolk from " + getName());
    }

}
