package dev.vengateshm.springboot_practice.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ProductService {
    List<Product> productList = Stream.of(
            new Product("1", "Mobile", 9500, "Samsung Galaxy A3"),
            new Product("2", "Laptop", 200000, "Acer &")
    ).collect(Collectors.toList());

    public List<Product> getProducts() {
        return productList;
    }

    public List<Product> getProducts(String from) {
        try {
            if (from.equals("cache")) {
                throw new DataRetrievalFailureException("Failed to retrieve from cache");
            } else {
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        "Rest client error occurred");
            }
        } catch (ProductServiceException e) {
            throw new ProductServiceException(e.getMessage());
        }
    }
}
