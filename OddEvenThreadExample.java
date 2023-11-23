//to get user input
import java.util.Scanner;

// i create a class OddEvenThread that extends Thread class 
class OddEvenThread extends Thread {
    int number; // To store the user provided number 

    //constructor to initialize the number
        public OddEvenThread(int number) {
        this.number = number;
    }
        

    //we override the run method
    public void run() {
        // Checks if the number is odd or even and display the result
        if (number % 2 == 0) { //if statement
            System.out.println("our number "+number + " is even");
        } else {
            System.out.println("our number "+number + " is odd");
        }
    }
}


// Main class
public class OddEvenThreadExample {
    public static void main(String[] args) { //main 
        Scanner scanner = new Scanner(System.in); //scanner 

        // the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  //get user input as a integer

        // create an OddEvenThread object and pass the number to the constructor
        OddEvenThread thread = new OddEvenThread(number);

        //start the thread to check odd/even and display the result
        thread.start();
    }
}
