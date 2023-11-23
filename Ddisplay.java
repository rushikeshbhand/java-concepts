class Shape { // parent class
    String color = "white";

    void display() {
        System.out.println("I am parent class display");
    }
}

class Rectangle extends Shape { // child class
    String color = "Black";

    @Override
    void display() {
        System.out.println("I am child class");
    }

    void show() {
        super.display(); // calling method of the parent class
        this.display();  // calling method of the current class
    }
}

public class Ddisplay {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.show();
    }
}