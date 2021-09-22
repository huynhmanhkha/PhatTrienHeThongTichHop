import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThread implements Runnable{
    private String message;
    WorkerThread(String a){
        this.message=a;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" (Start) message "+message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" End");
    }
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for(int i=1;i<10;i++)
        {
            Runnable worker = new WorkerThread(""+i);
            executor.execute(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated()){}
        System.out.println("Finish all thread");
    }
}

