class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I am child thread");
        }
    }
}

public class UseMyThread {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        t.setPriority(10); // setting the maximum priority of child thread
        t.start(); // starting the thread

        for (int i = 0; i < 5; i++) {
            System.out.println("I am main thread");
        }
    }
}
