public class ThreadDemo {
    public static void main(String[] args) {
        SimpleThread t1 = new SimpleThread("dhcntt15a");
        t1.start();

        SimpleThread t2 = new SimpleThread("dhcntt15b");
        t2.start();
    }
}
