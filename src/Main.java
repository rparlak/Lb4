public class Main {
    public static void main(String[] args) {
        // Creating a car object using the constructor
        Car myCar = new Car("Model X", "Tesla", 2023, 80000.0, "Red", 10);

        // Printing car information using toString() method
        System.out.println("Car Information (Initially):");
        System.out.println(myCar);

        // Calling sell() method to simulate car sales
        myCar.sell(3);

        // Printing updated car information using getter methods
        System.out.println("Updated Car Information:");
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Price: " + myCar.getPrice());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Quantity: " + myCar.getQuantity());

        // Changing car fields using setter methods
        myCar.setModel("Model Y");
        myCar.setPrice(90000.0);
        myCar.setQuantity(15);

        // Printing updated car information using toString() method
        System.out.println("Updated Car Information (After Modifications):");
        System.out.println(myCar);
    }
}
