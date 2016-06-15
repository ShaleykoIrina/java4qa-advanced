package thread.demo;

public class VisibilityIssueDemo {
    public static void main(String[] args) throws InterruptedException {
        Worker w = new Worker();
        w.start();
        Thread.sleep(2_000);
        w.setStop();
    }
}

class Worker extends Thread {
    private volatile boolean isStopped = false;

    public void setStop() {
        this.isStopped = true;
    }

    @Override
    public void run() {
        while (!isStopped) {

        }
    }
}
