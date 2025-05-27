class MyThread implements Runnable {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - " + i);
            try {
                Thread.sleep(500); // wait 500ms between messages
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread("🔥 Thread 1 is running"));
        Thread thread2 = new Thread(new MyThread("⚡ Thread 2 is vibing"));

        thread1.start(); // this kicks off thread1
        thread2.start(); // thread2 goes off at the same time!

        System.out.println("🚀 Main thread done launching other threads!");
    }
}

