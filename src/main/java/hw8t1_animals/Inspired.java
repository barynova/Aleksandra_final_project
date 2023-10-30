package hw8t1_animals;

abstract public class Inspired {
    private String name;

    public Inspired(String name) {
        this.name = name;
    }

    public abstract void inspire();

    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        // Створюємо кожного і викликаємо метод inspire() для кожного виду
        Inspired fish = new Fish("Fish");
        Inspired som = new Som("Som Sam");
        Inspired karas = new Karas("Karas Taras");
        Inspired shuka = new Shuka("Shuka Anzhela");
        Inspired pet = new Pet("Pet");
        Inspired cat = new Cat("Matvey");
        Inspired dog = new Dog("Rufus pyos");
        Inspired hamster = new Hamster("Bakster");


        fish.inspire();
        som.inspire();
        karas.inspire();
        shuka.inspire();
        pet.inspire();
        cat.inspire();
        dog.inspire();
        hamster.inspire();
}
}
