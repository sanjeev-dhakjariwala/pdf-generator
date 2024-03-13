package com.sanjeev.pdf.generator.entity;

public class Seller {
    private String sellerName;
    private String sellerGstin;
    private String sellerAddress;

    public Seller(String sellerName, String sellerGstin, String sellerAddress) {
        this.sellerName = sellerName;
        this.sellerGstin = sellerGstin;
        this.sellerAddress = sellerAddress;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerGstin() {
        return sellerGstin;
    }

    public void setSellerGstin(String sellerGstin) {
        this.sellerGstin = sellerGstin;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }
}
