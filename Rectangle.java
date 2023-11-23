class Rectangle {  //class name
    double length;
    double breadth;
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    double calculateArea() {
        return length * breadth;
    }
    
    double calculatePerimeter() {
        return 2 * (length + breadth);
    }
    
    void displayResults() {
        double area = calculateArea();
        double perimeter = calculatePerimeter();
        
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
    
    public static void main(String[] args) {  //main method
        double length = 5.5;        // Length of the rectangle
        double breadth = 3.2;      // Breadth of the rectangle
        
        Rectangle rectangle = new Rectangle(length, breadth); // Create a new Rectangle object
        rectangle.displayResults();     // Display the results (length, breadth, area, and perimeter)
    }
}
