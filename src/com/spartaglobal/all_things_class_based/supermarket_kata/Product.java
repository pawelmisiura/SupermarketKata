package com.spartaglobal.all_things_class_based.supermarket_kata;

public class Product {
    private double productPrice;
    private int productStock;
    private double revenueFromProduct;

    public Product(double productPrice, int productStock) {
        this.productPrice = productPrice;
        this.productStock = productStock;
        workoutRevenueFromProduct();
    }

    public double workoutRevenueFromProduct(){
        revenueFromProduct = productPrice * productStock;
        return revenueFromProduct;
    }
}
