package dev.vengateshm.springboot_practice.aosp.controller;

import dev.vengateshm.springboot_practice.aosp.Course;
import dev.vengateshm.springboot_practice.aosp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    public CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
