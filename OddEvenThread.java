import java.util.Scanner;

public class OddEvenThread {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Create two threads to check odd and even numbers
        Thread oddThread = new Thread(() -> {
            // Check if the number is odd
            if (number % 2 == 1) {
                System.out.println("The number is odd");
            }
        });

        Thread evenThread = new Thread(() -> {
            // Check if the number is even
            if (number % 2 == 0) {
                System.out.println("The number is even");
            }
        });

        // Start the threads
        oddThread.start(); // Starts the thread that checks for odd number
        evenThread.start(); // Starts the thread that checks for even number
    }
}

