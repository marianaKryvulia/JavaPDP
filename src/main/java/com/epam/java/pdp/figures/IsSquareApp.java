package com.epam.java.pdp.figures;

public class IsSquareApp {
    public static void main(String[] args) {
        final Point p1 = new Point(1, 1);
        final Point p2 = new Point(1, 2);
        final Point p3 = new Point(2, 1);
        final Point p4 = new Point(2,2);
        Shape rectangle = new Shape(p1, p2, p3, p4);
        rectangle.isSquare();
    }
}