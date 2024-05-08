package dev.vengateshm.springboot_practice.exception_handling;

public class Product {
    private String id;
    private String name;
    private int price;
    private String model;

    public Product(String id, String name, int price, String model) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
