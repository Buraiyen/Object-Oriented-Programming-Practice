
// Classes contain instructions for how objects can be created as well as how objects carry out certain actions
public class Human {

    String name, eyeColor;
    int age, heightInInches;

    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am" + age + " years old");
        System.out.println("My eye color is " + eyeColor);
    }

    public void eat() {
        System.out.println("eating...");
    }

    public void walk() {
        System.out.println("walking...");
    }

    public void work() {
        System.out.println("working...");
    }
}
