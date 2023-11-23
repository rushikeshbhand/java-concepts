// Rectangle class
class Rectangle {
    int length;
    int width;

    // Constructor to initialize length and width
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of the rectangle
    public int calculateArea() {
        return length * width;
    }
}

// Square class
class Square {
    int side;

    // Constructor to initialize side length
    public Square(int side) {
        this.side = side;
    }

    // Method to calculate area of the square
    public int calculateArea() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Rectangle object and calculate its area
        Rectangle rectangle = new Rectangle(5, 10);
        int rectangleArea = rectangle.calculateArea();
        System.out.println("Area of the Rectangle: " + rectangleArea);

        // Create a Square object and calculate its area
        Square square = new Square(7);
        int squareArea = square.calculateArea();
        System.out.println("Area of the Square: " + squareArea);
    }
}
