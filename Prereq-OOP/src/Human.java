
// Classes contain instructions for how objects can be created as well as how objects carry out certain actions
public class Human {

    // Basic attributes for a human
    String name, eyeColor;
    int age, heightInInches;

    // Constructor used to construct objects
    public Human(){ }

    // Constructor with passed-in values
    public Human(String name, String eyeColor, int age, int heightInInches) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.age = age;
        this.heightInInches = heightInInches;
    }

    /*The methods below define how the human will behave*/
    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor + "\n");
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
