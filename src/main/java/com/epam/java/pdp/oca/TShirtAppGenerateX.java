package com.epam.java.pdp.oca;

import com.epam.java.pdp.Second;

import java.util.Random;
import java.util.Scanner;

public class TShirtAppGenerateX {
    public static void main (String[] args){
        Random ts = new Random();
        int[] tsValues = new int[5];
        int temp;
        int sum = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the x value: ");
        int x = in.nextInt();
        //generate an array of int and put 5 values into array
        for (int i = 0; i<4; i++){
            temp = ts.nextInt(x +1 -sum);
            System.out.println("tsVal " + i +" " + temp);
            tsValues[i] = temp;
            sum +=temp;
        }

        int allDefault = tsValues[0];
        for (int i = 0; i < allDefault; i ++){
            TShirt defaultTshirt = new TShirt();
            System.out.println("Here is default TShirt " + i);
            System.out.println(defaultTshirt);
            }

        int onlySexDefault = tsValues[1];
        for (int i = 0; i < onlySexDefault; i ++){
            String size = Second.generateString(2);
            String color = Second.generateString(10);
            TShirt onlySexDefaultTShirts = new TShirt("sex",size,color);
            System.out.println("Here is TShirts with only sex default data: " +i);
            System.out.println(onlySexDefaultTShirts);
        }

        int onlySexAndSizeDefault = tsValues[2];
        for (int i = 0; i < onlySexAndSizeDefault; i ++) {
            TShirt tshirtonlySexAndSizeDefault = new TShirt("female", "m", "pink");
            System.out.println("Here is TShirts with only sex and size default data: " +i);
            System.out.println(tshirtonlySexAndSizeDefault);
        }

        int randomT = tsValues[3];
        for (int i = 0; i < randomT; i ++) {
            String sex = Second.generateString(3);
            String size = Second.generateString(2);
            String color = Second.generateString(10);
            String style = Second.generateString(5);
            String secondColor = Second.generateString(5);
            System.out.println("Here is TShirts with random data data: " +i );
            System.out.println(new TShirt(sex, size, color, style, secondColor).toString());
        }
    }
}
