package com.learning.java.concurrency;

/**
 * Created by cislo on 10/10/16.
 */

import static java.util.concurrent.TimeUnit.*;
import java.util.concurrent.*;

class ScheduledTask {
    private final ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(1);

    public void beepForAnHour() {
        final ScheduledFuture<?> beeperHandle =
                scheduler.scheduleAtFixedRate(() -> System.out.println("beep"), 10, 10, SECONDS);
        scheduler.schedule(() -> beeperHandle.cancel(true), 60 * 60, SECONDS);
    }

    public static void main(String args[]) {
        new ScheduledTask().beepForAnHour();
    }
}
