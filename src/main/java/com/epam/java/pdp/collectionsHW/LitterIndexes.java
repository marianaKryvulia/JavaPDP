package com.epam.java.pdp.collectionsHW;

import java.util.ArrayList;
import java.util.HashMap;
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
        long start = System.currentTimeMillis();
        for (int i = 0; i < str.length(); i++) {
            final Character letter = str.charAt(i);
            ArrayList<Integer> indexes;
            if ((indexes = hm.get(letter)) == null) {
                indexes = new ArrayList<Integer>();
                hm.put(letter, indexes);
            }
            indexes.add(i);
//            for (int j = 0; j < str.length(); j++) {
//                if (letter == str.charAt(j)) {
//                    indexes.add(j);
//                }
//            }
//            hm.put(letter, indexes);
        }

        //TODO: Home work sort
        System.out.println(hm.toString());
        System.out.println("Enter another item or \"quit\" to exit");
        System.out.println("Time to execute="+(System.currentTimeMillis() - start));
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
