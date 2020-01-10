package zoo;

// Superclass / Parent class
public class Animal {

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
}
