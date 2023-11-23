//Question.1 Create two thread.one thread is finding average of first 50 numbers and other thread is printing square of number store in array arr={10,15,20,25,30}.

public class ThreadQuestion {  //class name

    // Thread for finding the average of first 50 numbers
    static class AverageThread extends Thread {  //Thread number 1

        // This method calculates the average of the first 50 numbers and prints it
        public void run() {  // run method
            int sum = 0; // Initialize sum to 0
            for (int i = 1; i <= 50; i++) { // this for statement, iterate from 1 to 50 and add current number to sum
                sum = sum + i;
            }
             int average =  sum / 50; // Calculate the average
            System.out.println("Average of first 50 numbers = " + average); // Print the average
        }
    }

    // Thread for printing the square of numbers in the array
    static class SquareThread extends Thread {

        // array which is mentioned in our question
        int[] arr = {10, 15, 20, 25, 30};

        // this run method prints the square of each number in the array
        public void run() {
            System.out.print("Squares of numbers in the array = "); // Print the heading which i have write in double quotes
            for (int num : arr) { // Iterate through the array and print the square of each number
                int square = num * num;  //it calculates square and that square is sore in square
                System.out.print(square + " "); //it prints the square
            }
        }
    }

    // this is the main method where the program starts
    public static void main(String[] args) {

        //create the threads
        AverageThread avgThread = new AverageThread();
        SquareThread sqThread = new SquareThread();

        avgThread.start(); // Start the thread for finding the average of 50 numbers
        sqThread.start(); // Start the thread for printing the squares of numbers which is mentioned in array
    }
}
