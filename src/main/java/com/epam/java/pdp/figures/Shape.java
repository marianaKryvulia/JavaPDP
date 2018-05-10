package com.epam.java.pdp.figures;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    List<Point> points;
    List<Double> lineLengths;
    boolean oneLine;

    public Shape(Point... points) {
        this.points = new ArrayList<>();
        for (Point point : points) {
            this.points.add(point);
        }
    }


    void isTriangle() {
        if (oneLine == false & (points.size() == 3)) {
            arePointsOnTheSingleLine();
            System.out.println("This is a triangle");
        } else {
            System.out.println("This shape is not a triangle");
        }

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

    boolean arePointsOnTheSingleLine() {
        calculateLineLengths();
        double maxLength = 0;

        for (int i = 0; i < lineLengths.size(); i++) {
            if (lineLengths.get(i) > maxLength) {
                maxLength = lineLengths.get(i);
            }
        }
        for (int i = 0; i < lineLengths.size(); i++) {
            int nextIndex = i + 1;
            if (nextIndex == lineLengths.size()) {
                nextIndex = 0;
            }
            if (maxLength == lineLengths.get(i) + lineLengths.get(nextIndex)) {
                System.out.println("Points are on the same line.");
                oneLine = true;
            } else {
                System.out.println("Points are not on the single line.");
                oneLine = false;

            }

        }
        return oneLine;
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