package zoo;

public class Zoo {

    public static void main(String[] args) {
        Animal animal1 = new Animal(12, "M", 23);
        animal1.eat();
        // animal1.fly(); (This statement will not work)

        Bird bird1 = new Bird(3, "F", 5);
        bird1.fly();
        bird1.eat();

        Fish fish1 = new Fish(10, "F", 2);
        fish1.swim();
        fish1.sleep();

    }
}
