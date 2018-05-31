package com.epam.java.pdp.collectionsHW;

import java.util.LinkedList;
import java.util.Scanner;

public class LetterIndexes {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        str = in.next();
        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i)+ " " + i);
        }


    }
}
