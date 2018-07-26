package com.epam.java.pdp;

import java.util.Scanner;

public class First {

        public static void main(String[] args) {
            method1();
            oddValues(args);
            loopsExamples(args);
        }

        static void method1(){
            double par1, par2, par3, par4;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the first value: ");
            par1 = in.nextDouble();
            System.out.println("Enter the second value: ");
            par2 = in.nextDouble();
            System.out.println("Enter the third value: ");
            par3 = in.nextDouble ();
            System.out.println("Enter the forth value: ");
            par4 = in.nextDouble ();

            if (par1<par2 && par1<par3 && par1<par4){
                System.out.printf("The min value is: "+par1);
            }
            if (par2<par1 && par2<par3 && par2<par4){
                System.out.printf("The min value is: "+par2);
            }
            if (par3<par1 && par3<par2 && par3<par4){
                System.out.printf("The min value is: "+par3);
            }
            if (par4<par1 && par4<par2 && par4<par3){
                System.out.printf("The min value is: "+par4);
                System.out.println();
            }
        }
        /**
         * Print odd values from 1 to 100
         * @param args
         */
        public static void oddValues (String args[]) {

            System.out.println("The Odd Numbers from 1 to 100 are:");
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
        /**
         * @param args the command line arguments
         */
        public static void loopsExamples (String[] args) {
            //example of do while
            System.out.println("1 - do/while loop: ");
            int count = 0;
            do {
                System.out.println("do/while");
                count++;
            } while (count < 1);

            //example of while loop
            System.out.println("2 - while loop: ");
            count = 0;
            while(count < 2) {
                System.out.println("while");
                count++;
            }

            //example of for loop
            System.out.println("3 - for loop: ");
            for(int i = 0; i < 3; i++)
            {
                System.out.println("for");
                count++;
            }
        }

}
