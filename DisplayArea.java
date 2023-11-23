package display;
import calculation.Rectangle1; // Changed import to Rectangle1

public class DisplayArea {
    public static void main(String[] args) {
        // Create a Rectangle1 object and calculate the area
        Rectangle1 rectangle = new Rectangle1(5.0, 3.0); // Changed class name to Rectangle1
        double area = rectangle.calculateArea();

        // Display the calculated area
        System.out.println("Area of the rectangle: " + area);
    }
}
