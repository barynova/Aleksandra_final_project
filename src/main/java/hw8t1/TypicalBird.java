package hw8t1;

abstract public class TypicalBird implements Bird {
    public String name;
    public String sound;


    public TypicalBird(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println(getName() + " are popular in Ukraine, flying everywhere");
    }
}
