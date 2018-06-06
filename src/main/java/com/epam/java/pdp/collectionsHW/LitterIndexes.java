package com.epam.java.pdp.collectionsHW;

import java.util.*;
import java.util.Scanner;

public class LitterIndexes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string or \"quit\" to exit :");
        String str = in.nextLine();
        while (str.equalsIgnoreCase("quit") == false) {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i) + " " + i);
            }
            System.out.println("Enter another item or \"quit\" to exit");
            str = in.nextLine();
        }
    }
}
