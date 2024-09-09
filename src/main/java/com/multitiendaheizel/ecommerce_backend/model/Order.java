package com.multitiendaheizel.ecommerce_backend.model;

import java.util.Date;

public class Order {
    private Integer id;
    private  String number;
    private Date dateCreate;
    private Date dateReceive;

    private double total;

    public Order() {
    }

    public Order(Integer id, String number, Date dateCreate, Date dateReceive, double total) {
        this.id = id;
        this.number = number;
        this.dateCreate = dateCreate;
        this.dateReceive = dateReceive;
        this.total = total;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateReceive() {
        return dateReceive;
    }

    public void setDateReceive(Date dateReceive) {
        this.dateReceive = dateReceive;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", dateCreate=" + dateCreate +
                ", dateReceive=" + dateReceive +
                ", total=" + total +
                '}';
    }
}
