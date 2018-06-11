package com.epam.java.pdp.collectionsHW;

import java.util.*;
import java.util.List;
import java.util.Scanner;

//Ex1:
//        input: any string
//        output: letter indexes in the string
//        example:
//        input: "Hello Word"
//        output: H - [1], e - 2, l - [3, 4]  , o - [5, 8], whitespace - [6], W - [7], r- [9], d - [10]
//        Nice to have: sort the output by letter ascending
public class LitterIndexes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string or \"quit\" to exit :");
        HashMap<Character, ArrayList<Integer>> hm = new HashMap<Character, ArrayList<Integer>>();
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            ArrayList<Integer> indexes = new ArrayList<Integer>();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    indexes.add(j);
                }
            }
            hm.put(str.charAt(i), indexes);
        }
        System.out.println(hm.toString());
        System.out.println("Enter another item or \"quit\" to exit");
//            for (int i = 0; i < str.length(); i++) {
////                System.out.println(str.charAt(i) + " " + i);
//                List<Integer> index = new ArrayList<Integer>();
//                index.add(str.indexOf(str.charAt(i)));
//                System.out.println(index);
////                hm.put(str.charAt(i), index);
//            }
//            System.out.println(hm.toString());
//

    }
}
