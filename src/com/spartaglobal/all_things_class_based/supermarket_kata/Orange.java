package com.spartaglobal.all_things_class_based.supermarket_kata;

public class Orange extends Product implements Discount {

    public Orange(double productPrice, int productStock) {
        super(productPrice, productStock);
        System.out.println(setExpiryDate());
        System.out.println(workoutRevenueFromProduct());
        tenPercentDiscount();
    }

    public String setExpiryDate(){
        String expiryDate = "27/07/19";
        return expiryDate;
    }


    @Override
    public double tenPercentDiscount() {
        double revenue = workoutRevenueFromProduct();
        double discountedPrice = ( revenue - ( revenue * 0.1));
        System.out.println(discountedPrice);
        return discountedPrice;
    }
}
