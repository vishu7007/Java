public class threads extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        threads t1 = new threads();
        t1.run();
        t1.start();
    }
}
// TODO: handle exception
// Thread t2 = new Thread();
// int n = 8; // Number of threads
// for (int i = 0; i < n; i++) {
// Displaying the thread that is running
// System.out.println("Thread " + Thread.currentThread().getId() + " is
// running");