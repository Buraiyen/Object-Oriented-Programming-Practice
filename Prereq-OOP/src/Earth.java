public class Earth {

    public static void main(String[] args) {
        Human brian;            // Instance variable.
        brian = new Human();    // The actual object is created when this state
        brian.name = "Brian";
        brian.age = 21;
        brian.heightInInches = 72;
        brian.eyeColor = "brown";

        // Invoke method on the human object
        brian.speak();

        // Declaring new human without using any parameters
        Human tom = new Human();
        tom.speak();

        // Initialize new human with constructor parameters
        Human chester = new Human("Chester", "brown", 41, 64);
        chester.speak();


    }
}
