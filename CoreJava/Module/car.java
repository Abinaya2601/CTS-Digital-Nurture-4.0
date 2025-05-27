// Define the Car class
class Car {
    // Attributes (fields)
    String make;
    String model;
    int year;

    // Constructor to initialize the Car object
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make : " + make);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);
        System.out.println();
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Create objects of Car
        Car car1 = new Car("Tesla", "Model S", 2022);
        Car car2 = new Car("Toyota", "Corolla", 2019);

        // Call the method to display details
        car1.displayDetails();
        car2.d
