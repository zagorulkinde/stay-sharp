package edu.algos.problems.stepic;

import java.util.concurrent.TimeUnit;

public class ResetInterruption implements Runnable {
    public static void main(final String[] args) throws Exception {
        final Thread thread = new Thread(new ResetInterruption());
        thread.start();
        thread.interrupt();
        thread.join();
        System.out.printf("Interrupted %b%n", thread.isInterrupted());
        System.out.printf("Interrupted %b%n", thread.isInterrupted());
    }

    @Override
    public void run() {
        try {
            // The interrupted status of the current thread is cleared when InterruptedException is thrown by sleep() method.
            TimeUnit.SECONDS.sleep(3);
        } catch (final InterruptedException ex) {
            System.out.println(ex.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}