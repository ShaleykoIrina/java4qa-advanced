package com.db.edu.chat.thread.demo;

public class ThreadStopDemo {
    public static void main(String[] args) throws InterruptedException {
        StoppableThread t = new StoppableThread();
        t.start();
        Thread.sleep(2_000);
        t.setStopped(true);
    }
}

class StoppableThread extends Thread {
    private boolean isStopped;

    public void setStopped(boolean stopped) {
        isStopped = stopped;
    }

    @Override
    public void run() {
        while (!isStopped) {
        }
    }
}
