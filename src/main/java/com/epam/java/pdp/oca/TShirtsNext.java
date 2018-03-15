package com.epam.java.pdp.oca;

public class TShirtsNext {
    public static void main (String[] args){
        // there is a first object casual
        TShits casual = new TShits("male", "s", "white", "casual", "blue" );
        //toString method is defined TShirts class and now I use this method to print all info about casual object
        System.out.println(casual.toString());
        //change the style TBC
        casual.setStyle("lifestyle");
    }
}
