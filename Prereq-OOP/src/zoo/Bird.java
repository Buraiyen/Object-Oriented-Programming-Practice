package zoo;

// Bird is a subclass / child class of animal
public class Bird extends Animal{

    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);    // Calling the super class' constructor
    }

    /* Removed this method because not all birds can fly */
//    public void fly() {
//        System.out.println("fly...");
//    }
}
