package com.multitiendaheizel.ecommerce_backend.model;

public class OrderDetails {
    private Integer id ;
    private String name;

    private double price;
    private double amount;
    private double total;


    public OrderDetails() {
    }

    public OrderDetails(Integer id, String name, double price, double amount, double total) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", total=" + total +
                '}';
    }
}
