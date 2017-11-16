package ro.siit.java8;

public class DeliveryExecutor {

    private Thread lastThread;

    public void execute(Runnable job) throws Exception {

        lastThread = new Thread(job);
        lastThread.start();
    }

}
