package com.epam.java.pdp.figures;
import com.epam.java.pdp.figures.Point;

public class Shape {
    static int x1 = 1;
    static int x2 = 2;
    static int x3 = 3;
    static int y1 = 2;
    static int y2 = 1;
    static int y3 = 3;
    static Point p1 = new Point(x1, y1);
    static Point p2 = new Point(x2, y2);
    static Point p3 = new Point(x3, y3);
    static Line ln1 = new Line(p1,p2);
    static Line ln2 = new Line(p2,p3);
    static Line ln3 = new Line(p3,p1);
    static double a = ln1.lineLength();
    static double b = ln2.lineLength();
    static double c = ln3.lineLength();

   public static void main (String[] args){
       System.out.println("Line lengths are: ");
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);

       isTriangle();
       calcPerimeter();
       isTriangleRectangular();
       isTriangleIsosceles();
    }

  static  double calcPerimeter(){
        double perimeter = ln1.lineLength() + ln2.lineLength() + ln3.lineLength();
        System.out.println("Perimeter is: " + perimeter);
        return perimeter;
    }
  static boolean isTriangle(){
       if ((ln1.start == ln2.start | ln1.start == ln2.end | ln1.start == ln3.start | ln1.start == ln3.end ) &&
               (ln1.end == ln2.start | ln1.end == ln2.end | ln1.end == ln3.start | ln1.end == ln3.start)
               )
       {System.out.println("This is a triangle. ");
       return true;}
       else return false;
    }

    static boolean isTriangleRectangular(){
       if (((a*a) == ((b*b) + (c*c))) ||
            ((b*b) == ((a*a) + (c*c))) ||
            ((c*c) == ((a*a) + (b*b))))
            {System.out.println("Triangle is Rectangular.");
            return true;}
            else
            {System.out.println("Triangle is not Rectangular.");
            return false;}
}
  static boolean isTriangleIsosceles (){
       if (a == b || b == c || c ==a )
       {System.out.println("Triangle is Isosceles.");
           return true;}
           else
       {System.out.println("Triangle is not Isosceles.");
           return false;}
}
}
