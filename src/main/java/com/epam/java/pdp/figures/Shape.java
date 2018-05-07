package com.epam.java.pdp.figures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Shape {
    List<Point> points;
    List<Double> lines;

    public Shape(Point... points) {
        this.points = new ArrayList<>();
        for (Point point : points) {
            this.points.add(point);
        }
    }


    boolean isTriangle() {
        if (points.size() == 3) {
            System.out.println("This is triangle");
        }
        return true;
    }


    double calculateLines() {
        this.lines = new ArrayList<>();
        for (int i = 0; i < points.size(); ++i) {
            if (i != points.size()) {
                Line ln = (this.points.get(i), this.points.get(i++));
                this.lines.add(ln.lineLength((this.points.get(i)), this.points.get(i++)));
            } else {
                Line ln = (this.points.get(i), this.points.get(0));
                this.lines.add(ln.lineLength((this.points.get(i)), this.points.get(i++)));
            }
        }

    }

    double areLinesOnTheSingleLine() {
        double maxLength = 0;
//        for (int i=0; i< points.size(); i++){
//            if (lines.get(i) > maxLength){
//                maxLength = lines.get(i);
//            }
//        }
        for (int i = 0; i < points.size(); ++i) {
            if (maxLength == lines.get(i) + lines.get(i++)) {
                System.out.println("Points are on the same line.");
            } else {
                System.out.println("Points are not on the single line.");
            }
        }
        return maxLength;
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