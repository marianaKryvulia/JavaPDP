package com.epam.java.pdp.figures;

public class Line {
    Point start;
    Point end;

    Line(Point startPoint, Point endPoint) {
        if (startPoint == null || endPoint == null) {
            throw new RuntimeException();
        }
        this.start = startPoint;
        this.end = endPoint;
    }

    public double lineLength() {
        double catetByX = end.x - start.x;
        double catetByY = start.y - end.y;
        return Math.sqrt(catetByX * catetByX + catetByY * catetByY);
    }
}
