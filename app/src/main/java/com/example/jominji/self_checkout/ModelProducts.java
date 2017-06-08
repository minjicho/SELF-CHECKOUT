package com.example.jominji.self_checkout;

/**
 * Created by jo minji on 2017-06-08.
 */

public class ModelProducts {
    private String productName;
    private String productDesc;
    private int productPrice;
    public ModelProducts(String productName,String productDesc,int productPrice){
        this.productName = productName;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
    }

    public String getProductName(){
        return productName;
    }

    public String getProductDesc(){
        return productDesc;
    }

    public int getProductPrice(){
        return productPrice;
    }
}