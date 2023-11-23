package javacourse;

//in this code we calculates that the perimeter of a square, a rectangle, and a circle by using mehtod overloading 
public class Perimeter {  //this is class name 

	//perimeter of square 
 public static void perimeterCalculation(double s) {
     System.out.println("Perimeter of a square is " + 4 * s);
 }
   //perimeter of rectangle 
 public static void perimeterCalculation(double l, double b) {
     System.out.println("Perimeter of a rectangle is " + 2 * (l + b));
 }
   //perimeter of circle
 public static void perimeterCalculation(double r) {
     System.out.println("Perimeter of a circle is " + 2 * (22 / 7) * r);
 }


 // main method calls the perimeterCalculation() method for a square, a rectangle, and a circle
 public static void main(String[] args) {
     perimeterCalculation(2);
     perimeterCalculation(10, 4);
     perimeterCalculation(2);
     
 }
}
