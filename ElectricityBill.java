package javacourse;

import java.util.Scanner;  //scanner package to use scanner in our code

//calculate electricity bill
class ElectricityBillCalculator {  //second class name 

 public static void calculateElectricityBill(int units) {
     double billRs= 0; // Initialize the bill amount because bill amount start from zero

     // charging rates based on units consume
     if (units <= 100) { // this condition executes when user only consumes electricity under 100 units
    	 billRs = units * 10;
     } else if (units <= 200) {
    	 billRs = 100 * 10 + (units - 100) * 15;
     } else if (units <= 300) {
    	 billRs = 100 * 10 + 100 * 15 + (units - 200) * 20;
     } else {
    	 billRs = 100 * 10 + 100 * 15 + 100 * 20 + (units - 300) * 25;
     }

     // calculated electricity bill
     System.out.println("Electricity Billin Rs " + billRs);
 }
}

//Main class to take user input and call methods
public class ElectricityBill {  // main class name
 public static void main(String[] args) {  // main method name
     Scanner scanner = new Scanner(System.in);   //scanner class for getting input  

     // user enter how much units he has consumed
     System.out.print("Enter the amount of KWh units consumed of electricity ");
     int units = scanner.nextInt();

     // Call calculateElectricityBill method from ElectricityBillclass
     ElectricityBillCalculator.calculateElectricityBill(units);


 }
}

