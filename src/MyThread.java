public class MyThread extends Thread {
    @Override
    public synchronized void start() {
        super.start();
        System.out.println("+++++++");
    }

    public void run() {
        System.out.println("start");
    }
}
