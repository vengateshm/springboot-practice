package dev.vengateshm.springboot_practice.exception_handling;

public class DataRetrievalFailureException extends RuntimeException {
    public DataRetrievalFailureException(String message) {
        super(message);
    }
}
