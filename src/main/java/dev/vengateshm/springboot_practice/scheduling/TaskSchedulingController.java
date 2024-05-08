package dev.vengateshm.springboot_practice.scheduling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
@Slf4j
public class TaskSchedulingController {
    @Autowired
    private TaskSchedulingService taskSchedulingService;

    @PostMapping
    public ResponseEntity<Integer> createTask(@RequestParam String name) {
        Runnable task = () -> log.info("Task name " + name);
        int id = taskSchedulingService.addNewTask(task);
        return ResponseEntity.ok(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable int id) {
        taskSchedulingService.removeTask(id);
    }
}
