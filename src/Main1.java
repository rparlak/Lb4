import java.util.Scanner;

class RectangleArea {
    private double length;
    private double width;
    private double area;

    // Method to get input from the user
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
        scanner.close();
    }

    // Method to compute the area of the rectangle
    public void computeArea() {
        area = length * width;
    }

    // Method to display the rectangle information and area
    public void displayArea() {
        System.out.println("Rectangle Information:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Creating an object of RectangleArea class
        RectangleArea rectangle = new RectangleArea();

        // Calling methods on RectangleArea object
        rectangle.getData();
        rectangle.computeArea();
        rectangle.displayArea();
    }
}
