package com.epam.java.pdp.figures;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Shape {
    List<Point> points;
    List<Double> lineLengths;
    boolean oneLine;


    public Shape(Point... points) {
        Queue q = new LinkedList();
        this.points = new ArrayList<>();
        for (Point point : points) {
            this.points.add(point);
        }
        this.lineLengths = calculateLineLengths();
    }


    boolean isTriangle() {
        if ((points.size() == 3) && !arePointsOnTheSingleLine()) {
            System.out.println("This is a triangle");
            return true;
        } else {
            System.out.println("This shape is not a triangle");
        }
        return false;
    }


    private List<Double> calculateLineLengths() {
        List<Double> lineLengths = new ArrayList<>();
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
        return lineLengths;
    }

    private boolean arePointsOnTheSingleLine() {
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
                return true;
            }
        }
        return false;
    }

    public boolean isTriangleRectangular() {
        if (!isTriangle()) {
            return false;
        }
        if (((lineLengths.get(0) * lineLengths.get(0)) == ((lineLengths.get(1) * lineLengths.get(1)) + (lineLengths.get(2) * lineLengths.get(2)))) ||
                ((lineLengths.get(1) * lineLengths.get(1)) == ((lineLengths.get(0) * lineLengths.get(0)) + (lineLengths.get(2) * lineLengths.get(2)))) ||
                ((lineLengths.get(2) * lineLengths.get(2)) == ((lineLengths.get(0) * lineLengths.get(0)) + (lineLengths.get(1) * lineLengths.get(1))))) {
            System.out.println("Triangle is Rectangular.");
            return true;
        } else {
            System.out.println("Triangle is not Rectangular.");
        }

        return false;
    }


    public void isTriangleIsosceles() {
        if (lineLengths.get(0).equals(lineLengths.get(1)) || lineLengths.get(1).equals(lineLengths.get(2)) || lineLengths.get(2).equals(lineLengths.get(0))) {
            System.out.println("Triangle is Isosceles.");
        } else {
            System.out.println("Triangle is not Isosceles.");
        }

    }

    public void isSquare() {
        boolean isSquare = false;
        double sideLength = lineLengths.get(0);
        for (int i = 1; i < lineLengths.size(); i++) {
            if (lineLengths.get(i).equals(sideLength)) {
                isSquare = true;
                // return true;
            } else {
                isSquare = false;
            }
        }
        System.out.println("the shape is square: " + isSquare);
        //return isSquare;
    }


    public boolean isRectangle() {
        List<Double> uniqueLines = new ArrayList<Double>(new HashSet<Double>(lineLengths));
        if ((points.size() == 4) && uniqueLines.size() == 3) {
            System.out.println("This is a rectangle");
            return true;
        } else {
            System.out.println("This shape is not a rectangle");
        }
        System.out.println(uniqueLines.toString());
        return false;
    }

}