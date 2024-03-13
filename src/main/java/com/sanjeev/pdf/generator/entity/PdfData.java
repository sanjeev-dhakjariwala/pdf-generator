package com.sanjeev.pdf.generator.entity;

public class PdfData {
    private Buyer buyer;
    private  Seller seller;
    private Item[] items;

    public PdfData(Buyer buyer, Seller seller, Item[] items) {
        this.buyer = buyer;
        this.seller = seller;
        this.items = items;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
