public class UseMyThread {
    public static void main(String[] args) {
        MyThread a = new MyThread();
        a.start();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(".....");
            }
        });
        thread.start();

        UseMyRunnable myRunnable = new UseMyRunnable();
        Thread thread2 = new Thread( myRunnable);
        thread2.start();
    }
}
