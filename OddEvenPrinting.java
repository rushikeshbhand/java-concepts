//package name 
package javacourse;  

//class name
class OddEvenPrinting {  
    // Runnable class for printing odd numbers
    static class OddPrinter implements Runnable {
        
        public void run() {
            for (int i = 1; i <= 100; i += 2) {
                System.out.println("Odd " + i);
            }
        }
    }

    // Runnable class for printing even numbers
    static class EvenPrinter implements Runnable {
      
        public void run() {
            for (int i = 2; i <= 100; i += 2) {
                System.out.println("Even " + i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // thread for odd number printing
        Thread oddThread = new Thread(new OddPrinter());

        // thread for even number printing
        Thread evenThread = new Thread(new EvenPrinter());

        // Start the thread for odd number printing
        oddThread.start();

        // it makes wait for the oddThread to finish its work
        try {
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println("Exception e");
        }

        // Start the thread for even number printing
        evenThread.start();
        evenThread.join();
    }
}

