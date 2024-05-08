package dev.vengateshm.springboot_practice.controller;

import dev.vengateshm.springboot_practice.exception_handling.Product;
import dev.vengateshm.springboot_practice.exception_handling.ProductService;
import dev.vengateshm.springboot_practice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts("cache");
    }
}
