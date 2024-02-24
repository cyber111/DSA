package VehicalOverloading;

public class Bike extends Vehicle {

    @Override
    void run() {
        System.out.println("Bike is running");
    }

    @Override
    public String toString() {
        return "To String called";
    }
}
