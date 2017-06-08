package com.example.jominji.self_checkout;

import android.app.Application;
import android.hardware.usb.UsbDevice;

import java.util.ArrayList;

/**
 * Created by jo minji on 2017-06-08.
 */

public class Controller extends Application {
    private ArrayList<ModelProducts> myproducts = new ArrayList<ModelProducts>();
    private ModelCart myCart = new ModelCart();
    public ModelProducts getProducts(int pPosition){
        return myproducts.get(pPosition);
    }
    public void  setProducts(ModelProducts products){
        myproducts.add(products);
    }
    public ModelCart getCart(){
        return myCart;
    }

    public int getProductArraylistsize() {
        return 0;
    }

    public void setProducts() {
    }
}