package com.epam.java.pdp;

public class GenerateString {
    static int lenght = 5;
    static String str = "" ;

    public static void main (String[] args){
    generateString();
    }

public static void generateString() {
     for (int i = 0; i< lenght; ++i ){
         str = str + "a";
     }
    System.out.println("Generated random default length string:" +str);
//     return str;
    }

}

