package lesson_1;

public class App {

    public static void main(String[] args) {

        // Two objects are different from one another
        Vehicle vehicle = new Vehicle();
        Vehicle anotherVehicle = new Vehicle();

        vehicle.accelerate();
        anotherVehicle.accelerate();

    }
}
