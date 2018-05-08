package com.epam.java.pdp.figures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Shape {
    List<Point> points;
    List<Double> lineLengths;

    public Shape(Point... points) {
        this.points = new ArrayList<>();
        for (Point point : points) {
            this.points.add(point);
        }
    }


    boolean isTriangle() {
        if (points.size() == 3) {
//            calculateLineLengths();
            arePointsOnTheSingleLine();
            System.out.println("This is a triangle");
        }
        return true;

    }


    void calculateLineLengths() {
        this.lineLengths = new ArrayList<>();
        for (int i = 0; i < points.size(); i++) {
            Point start = points.get(i);
            int endIndex = i + 1;
            if (endIndex == points.size()) {
                endIndex = 0;
            }
            Point end = this.points.get(endIndex);
            Line line = new Line(start, end);
            double length = line.lineLength();
            lineLengths.add(length);

        }

    }

    void arePointsOnTheSingleLine() {
        calculateLineLengths();
        double maxLength = 0;
//        for (int i=0; i< points.size(); i++){
//            if (lines.get(i) > maxLength){
//                maxLength = lines.get(i);
//            }
//        }
        for (int i = 0; i < points.size(); i++) {
//            int nextIndex = i + 1;
            if (maxLength == lineLengths.get(i) + lineLengths.get(i++)) {
                System.out.println("Points are on the same line.");
            } else {
                System.out.println("Points are not on the single line.");
            }
        }
        for (Double maxLineLength : lineLengths) {
        }
    }

    void isTriangleRectangular() {

//        if (((a * a) == ((b * b) + (c * c))) ||
//                ((b * b) == ((a * a) + (c * c))) ||
//                ((c * c) == ((a * a) + (b * b)))) {
//            System.out.println("Triangle is Rectangular.");
//            return true;
//        } else {
//            System.out.println("Triangle is not Rectangular.");
//        }

    }


    void isTriangleIsosceles() {
//        if (a == b || b == c || c == a) {
//            System.out.println("Triangle is Isosceles.");
//            return true;
//        } else {
//            System.out.println("Triangle is not Isosceles.");
//        }
//        return false;
    }
}