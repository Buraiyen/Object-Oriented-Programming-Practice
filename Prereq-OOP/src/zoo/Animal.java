package zoo;

public class Animal {

    int age, weightInLbs;
    String gender;

    public Animal(int age, int weightInLbs, String gender) {
        this.age = age;
        this.weightInLbs = weightInLbs;
        this.gender = gender;
    }

    public void eat() {
        System.out.println("eating...");
    }

    public void sleep() {
        System.out.println("sleeping...");
    }
}
