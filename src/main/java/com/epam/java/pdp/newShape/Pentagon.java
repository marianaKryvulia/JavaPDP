package com.epam.java.pdp.newShape;

import com.epam.java.pdp.figures.Point;

import java.util.List;

public class Pentagon implements Shape {
    List<Point> points;

    public Pentagon(List<Point> points) {
        this.points = points;
    }

    @Override
    public String shapeType() {
        return null;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
