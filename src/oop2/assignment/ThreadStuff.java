package oop2.assignment;

public class ThreadStuff implements Runnable {
    int counter = 0;

    @Override
    public void run() {
        try {
            System.out.println(counter);
            Thread.sleep(1000);
            counter++;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
