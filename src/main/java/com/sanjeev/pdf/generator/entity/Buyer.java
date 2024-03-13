package com.sanjeev.pdf.generator.entity;

public class Buyer {
    private String buyerName;
    private String buyerGstin;
    private String buyerAddress;

    public Buyer(String buyerName, String buyerGstin, String buyerAddress) {
        this.buyerName = buyerName;
        this.buyerGstin = buyerGstin;
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyerGstin() {
        return buyerGstin;
    }

    public void setBuyerGstin(String buyerGstin) {
        this.buyerGstin = buyerGstin;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }
}
