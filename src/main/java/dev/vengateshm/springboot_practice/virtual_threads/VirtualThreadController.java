package dev.vengateshm.springboot_practice.virtual_threads;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/vt")
@Slf4j
public class VirtualThreadController {
    @GetMapping
    public List<String> getItems() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Thread info {}", Thread.currentThread());
        return Arrays.asList("Item 1", "Item 2");
    }
}
