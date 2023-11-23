// Q2. Create a thread and set its priority to 7 and print the priority of all the threads

public class ThreadPriorityExample {  //class name 

    // this class extends the Thread class and defines a simple
    static class Thread1 extends Thread {   //extends thread class in thread1 class 

        public void run() {  //run() method which prints priority of this thread
            System.out.println("Thread1 with priority " + getPriority());
        }
    }

    // This is the main method where the program starts
    public static void main(String[] args) {

        // we create a Thread1 object and set its priority to 7
        Thread1 thread1 = new Thread1();
        thread1.setPriority(7); // line use sets the priority of the Thread1 object to 7

        // Print the priority of Thread1
        System.out.println("Priority of Thread1 " + thread1.getPriority()); // This line prints the priority of the Thread1 object

        // Create a default thread.
        Thread defaultThread = new Thread();  // default thread is the name of our second thread

        // Print the priority of the default thread.
        System.out.println("Priority of default thread " + defaultThread.getPriority()); // This line prints the priority of the default thread

        // we start here two threads
        thread1.start();    // thread no 1
        defaultThread.start();  // thread no 2
    }
}
