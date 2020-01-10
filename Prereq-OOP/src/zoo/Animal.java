package zoo;

// Superclass / Parent class
// abstract classes can only be extended. You can't instantiate an instance of an abstract class. It's only meant to be a parent of another class
public abstract class Animal {

    int age, weightInLbs;
    String gender;

    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public void eat() {
        System.out.println("eating...");
    }

    public void sleep() {
        System.out.println("sleeping...");
    }

    // There are different ways an animal can move, so there is no specific implementation here
    public abstract void move();
}
