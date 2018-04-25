package com.epam.java.pdp.figures;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    List<Point> points;

    public Shape(Point... points){
        this.points = new ArrayList<>();
        for (Point point : points) {
            this.points.add(point);
        }
    }
    boolean isTriangle() {
        if (points.size() == 3){
            
        }
//        if ((ln1.start == ln2.start || ln1.start == ln2.end | ln1.start == ln3.start | ln1.start == ln3.end) &&
//                (ln1.end == ln2.start | ln1.end == ln2.end | ln1.end == ln3.start | ln1.end == ln3.start) &&
//                (ln2.start == ln3.start | ln2.start == ln3.end | ln2.start == ln1.start | ln2.start == ln1.end) &&
//                (ln2.end == ln3.start | ln2.end == ln3.end | ln2.end == ln1.start | ln2.end == ln1.start)
//                ) {
//            System.out.println("This is a triangle. ");
//            return true;
//        } else
            return false;
    }

    boolean isTriangleRectangular() {

//        if (((a * a) == ((b * b) + (c * c))) ||
//                ((b * b) == ((a * a) + (c * c))) ||
//                ((c * c) == ((a * a) + (b * b)))) {
//            System.out.println("Triangle is Rectangular.");
//            return true;
//        } else {
//            System.out.println("Triangle is not Rectangular.");
//        }
        return false;
    }
    boolean isTriangleIsosceles() {
//        if (a == b || b == c || c == a) {
//            System.out.println("Triangle is Isosceles.");
//            return true;
//        } else {
//            System.out.println("Triangle is not Isosceles.");
//        }
        return false;
    }
}