package dev.vengateshm.springboot_practice.exception_handling;

public class ProductServiceException extends RuntimeException {
    public ProductServiceException(String message) {
        super(message);
    }
}
