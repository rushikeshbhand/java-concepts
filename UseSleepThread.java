

class MyThread3 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am child thread");
        }
    }
}

public class UseSleepThread {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 t = new MyThread3(); // Create the child thread
        t.start(); // Start the thread

        for (int i = 0; i < 5; i++) {
            System.out.println("I am main thread");
            Thread.sleep(1000); // Pause the main thread for 1000 milliseconds (1 second)
        }
    }
}
