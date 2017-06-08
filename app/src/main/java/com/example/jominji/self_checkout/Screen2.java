package com.example.jominji.self_checkout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by jo minji on 2017-06-08.
 */

public class Screen2 extends Activity {
    /* (non-Javadoc)
    * @see android.app.Activity#onCreate(android.os.Bundle) */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.Screen2);
        TextView showCartContent = (TextView)findViewById(R.id.showcart);
        final Controller ct = (Controller)getApplicationContext();
        final int CartSize = ct.getCart().getCartsize();
        String show = "";
        for(int i=0;i<CartSize;i++){
            String pName = ct.getCart().getProducts(i).getProductName();
            int  pPrice = ct.getCart().getProducts(i).getProductPrice();
            String pDisc = ct.getCart().getProducts(i).getProductDesc();
            show += "Product Name:"+pName+" "+"Price : "+pPrice+""+"Discription : "+pDisc+""+    "-----------------------------------";
        }
        showCartContent.setText(show);
    }
}
