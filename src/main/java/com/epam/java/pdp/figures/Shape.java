package com.epam.java.pdp.figures;
import com.epam.java.pdp.figures.Point;

public class Shape {
/*    static Point p1 = new Point(int x1, int y1);
    static Point p2 = new Point(int x2, int y2);
    static Point p3 = new Point(int x3, int y3);*/
    static double a,b,c;
    static int x1 = 1;
    static int x2 = 2;
    static int x3 = 3;
    static int y1 = 2;
    static int y2 = 1;
    static int y3 = 3;
   public static void main (String[] args){
       a = Math.sqrt( ( ( x3 - x2 ) * ( x3 - x2 ) ) + ( ( y3 - y2 ) * ( y3 - y2 ) ) );
       b = Math.sqrt( ( ( x3 - x1 ) * ( x3 - x1 ) ) + ( ( y3 - y1 ) * ( y3 - y1 ) ) );
       c = Math.sqrt( ( ( x2 - x1 ) * ( x2 - x1 ) ) + ( ( y2 - y1 ) * ( y2 - y1 ) ) );
       System.out.println("Lines lengths are: " + a + " " + b + " " + c );
       calcPerimeter();
       isTriangleRectangular();
       isTriangleIsosceles();
    }
public static void calcPerimeter(){
       double perimeter = a + b + c;
       System.out.println("Perimeter is: " + perimeter);
}
public static boolean isTriangleRectangular(){
       if (((a*a) == ((b*b) + (c*c))) ||
            ((b*b) == ((a*a) + (c*c))) ||
            ((c*c) == ((a*a) + (b*b))))
            {System.out.println("Triangle is Rectangular.");
            return true;}
            else
            {System.out.println("Triangle is not Rectangular.");
            return false;}
}
public static boolean isTriangleIsosceles (){
       if (a == b || b == c || c ==a )
       {System.out.println("Triangle is Isosceles.");
           return true;}
           else
       {System.out.println("Triangle is not Isosceles.");
           return false;}
}
}
