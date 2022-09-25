package oop;

public class Product {
    private String name;
    private double unitPrice; //birim fiyatı
    private double discount; //indirim oranı
    private String imageUrl; //domain:iş
    private int unitsInStock; //stoktaki birim

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
