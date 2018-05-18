package com.epam.java.pdp.oca;

import com.epam.java.pdp.Second;

public class TShirtApp {
    public static void main (String[] args){
        TShirt defaultTshirt = new TShirt();
       System.out.println(defaultTshirt);
       TShirt tshirtWithModifiedRequiredAttributes = new TShirt("female","m","pink");
       System.out.println(tshirtWithModifiedRequiredAttributes);
       TShirt tshirtWithOptionalAttributes = new TShirt("kid","xs","green","kidsStyle","yellow");
       System.out.println(tshirtWithOptionalAttributes);
        String sex = Second.generateString(3);
        String size = Second.generateString(2);
        String color = Second.generateString(10);
        System.out.println(new TShirt(sex, size, color).toString());
    }
}
