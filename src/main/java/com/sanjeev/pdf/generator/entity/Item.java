package com.sanjeev.pdf.generator.entity;

public class Item {
    private String name;
    private String quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Item(String name, String quantity, String rate, String amount) {
        this.name = name;
        this.quantity = quantity;
        this.rate = rate;
        this.amount = amount;
    }

    private String rate;
    private String amount;
}
