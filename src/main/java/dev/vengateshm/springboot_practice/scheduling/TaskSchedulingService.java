package dev.vengateshm.springboot_practice.scheduling;

import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class TaskSchedulingService {
    private final TaskScheduler taskScheduler;

    public TaskSchedulingService(TaskScheduler taskScheduler) {
        this.taskScheduler = taskScheduler;
    }

    private final AtomicInteger taskId = new AtomicInteger();
    private final HashMap<Integer, ScheduledFuture<?>> futures = new HashMap<>();

    public int addNewTask(Runnable task) {
        Duration taskPeriod = Duration.ofSeconds(2);
        ScheduledFuture<?> scheduledFuture = taskScheduler.scheduleAtFixedRate(task, taskPeriod);
        int id = taskId.incrementAndGet();
        futures.put(id, scheduledFuture);
        return id;
    }

    public void removeTask(int taskId) {
        ScheduledFuture<?> scheduledFuture = futures.get(taskId);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            futures.remove(taskId);
        }
    }
}
