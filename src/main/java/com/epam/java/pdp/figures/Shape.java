package com.epam.java.pdp.figures;

public class Shape {
    int x1 = 1;
    int x2 = 2;
    int x3 = 3;
    int y1 = 2;
    int y2 = 1;
    int y3 = 3;
    Point p1 = new Point(x1, y1);
    Point p2 = new Point(x2, y2);
    Point p3 = new Point(x3, y3);
    Line ln1 = new Line(p1, p2);
    Line ln2 = new Line(p2, p3);
    Line ln3 = new Line(p3, p1);
    double a = ln1.lineLength(p1, p2);
    double b = ln2.lineLength(p2, p3);
    double c = ln3.lineLength(p3, p1);

    boolean isTriangle() {
        if ((ln1.start == ln2.start | ln1.start == ln2.end | ln1.start == ln3.start | ln1.start == ln3.end) &&
                (ln1.end == ln2.start | ln1.end == ln2.end | ln1.end == ln3.start | ln1.end == ln3.start) &&
                (ln2.start == ln3.start | ln2.start == ln3.end | ln2.start == ln1.start | ln2.start == ln1.end) &&
                (ln2.end == ln3.start | ln2.end == ln3.end | ln2.end == ln1.start | ln2.end == ln1.start)
                ) {
            System.out.println("This is a triangle. ");
            return true;
        } else return false;
    }

    boolean isTriangleRectangular() {

        if (((a * a) == ((b * b) + (c * c))) ||
                ((b * b) == ((a * a) + (c * c))) ||
                ((c * c) == ((a * a) + (b * b)))) {
            System.out.println("Triangle is Rectangular.");
            return true;
        } else {
            System.out.println("Triangle is not Rectangular.");
            return false;
        }
    }
    boolean isTriangleIsosceles() {
        if (a == b || b == c || c == a) {
            System.out.println("Triangle is Isosceles.");
            return true;
        } else {
            System.out.println("Triangle is not Isosceles.");
            return false;
        }
    }
}