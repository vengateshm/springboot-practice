package dev.vengateshm.springboot_practice.aosp.service;

import dev.vengateshm.springboot_practice.aosp.Course;
import dev.vengateshm.springboot_practice.aosp.annotation.TrackExecutionTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@Slf4j
public class CourseService {
    @TrackExecutionTime
    public List<Course> getAllCourses() {
        log.info("Inside getAllCourses() in CourseService");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Stream.of(
                new Course(1, "Java"),
                new Course(2, "Kotlin")
        ).collect(Collectors.toList());
    }
}
