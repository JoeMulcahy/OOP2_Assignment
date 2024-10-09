package oop2.assignment.timing;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GameTimer{
    public boolean isRunning;
    private int period;
    private long startTime;
    private long currentTime;
    private ScheduledExecutorService scheduler;
    private long countPulse;

    public GameTimer(){
        isRunning = false;
        period = 1;
        currentTime = 0;
    }

    private void initialiseTimer(){
        startTime = System.nanoTime();
        scheduler = Executors.newScheduledThreadPool(1);
        Runnable task = new Runnable() {
            public void run() {
                currentTime = System.nanoTime();
                countPulse++;
            }
        };
        if (isRunning) {
            scheduler.scheduleAtFixedRate(task, 0L, (long)period, TimeUnit.MILLISECONDS);
        }
    }

    public long getTimeRunningInSeconds(){
        return (currentTime - startTime) / 1000000000L;
    }

    public long timeRunningInMilliSeconds() {
        return (currentTime - startTime) / 1000000L;
    }

    public void stop() {
        isRunning = false;
        scheduler.shutdown();
    }

    public void start() {
        isRunning = true;
        new GameTimer();
    }


}
