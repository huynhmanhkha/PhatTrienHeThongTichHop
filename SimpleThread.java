public class SimpleThread extends Thread {

    private String threadName;
    private Thread t;

    SimpleThread(String name) {
        threadName = name;
        System.out.println("Đang tạo " + threadName);
    }

    public void run() {
        System.out.println(threadName + " đang chạy");
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println(threadName + " - " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(threadName + " tạm ngưng");

    }

    // public void start() {
    //     System.out.println("Bắt đầu luồng " + threadName);
    //     if (t == null) {
    //         t = new Thread(this, threadName);
    //         start();
    //     }
    // }

}
