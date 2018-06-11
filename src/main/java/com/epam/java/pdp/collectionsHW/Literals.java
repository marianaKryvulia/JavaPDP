package com.epam.java.pdp.collectionsHW;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

//input: any string literalS from console
//        output: number of unique characters in the input string AND has it already appeared or no (calculation on the same string have to be performed only once)
//        example:
//        input 1: "Hello Word"
//        output 1: 6
//        input 2: "Hello Word"
//        output 2: 6, (no calculations happened, result has been taken from a cache)
//        input 3" "Abcde"
//        output 3: 5
//        input 4: "edcba"
//        output 4: 5
public class Literals {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        System.out.println("Enter the string or \"quit\" to exit :");
        String str = in.nextLine();
        while (str.equalsIgnoreCase("quit") == false) {
            if (hmap.containsKey(str.toLowerCase())) {
                System.out.println(hmap.get(str) + ", (no calculations happened, result has been taken from a cache)");
                System.out.println("Enter another item or \"quit\" to exit");
                str = in.nextLine();
            } else {
                char[] chars = str.toCharArray();
                Set<Character> uniqueChars = new HashSet<>();

                for (char c : chars) {
                    uniqueChars.add(c);
                }

                hmap.put(str, uniqueChars.size());
                System.out.println(str + " " + uniqueChars.size());
            }

            System.out.println("Enter another item or \"quit\" to exit");
            str = in.nextLine();
        }

    }

}