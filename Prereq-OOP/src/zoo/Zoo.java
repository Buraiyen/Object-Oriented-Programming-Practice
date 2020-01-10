package zoo;

public class Zoo {

    public static void main(String[] args) {
        /* Now that the Animal class is abstract, instantiating that class will no longer work */
//        Animal animal1 = new Animal(12, "M", 23);
//        animal1.eat();
        // animal1.fly(); (This statement will not work)

//        Bird bird1 = new Bird(3, "F", 5);
//        // bird1.fly();
//        bird1.eat();
//
//        Fish fish1 = new Fish(10, "F", 2);
//        fish1.swim();
//        fish1.sleep();
//
//        Chicken chicken = new Chicken(10, "F", 2);
//        // chicken.fly();
//
//
//        /*Notice how both objects move*/
//        Sparrow sparrow = new Sparrow(1, "M", 4);
//        moveAnimals(sparrow);
//
//        // Variable type is animal but the actual object created in memory is Fish
//        Animal fish2 = new Fish(1, "M", 2);
//        moveAnimals(fish2);

        Flyable flyingBird = new Sparrow(1, "M", 4);

        // Does not work because not all birds can fly
        //Flyable flyingBird2 = new Bird(1, "M", 4);

    }

    // Since the method is passing in type Animal, all of its children can use this method
    // This is called polymorphism, which makes the program more dynamic
    public static void moveAnimals(Animal animal) {
        animal.move();
    }
}
