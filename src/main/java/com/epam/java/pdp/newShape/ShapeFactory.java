package com.epam.java.pdp.newShape;


import com.epam.java.pdp.figures.Point;

import java.util.List;

public class ShapeFactory {

    public Triangle createTriangleIfPossible(List<Point> points) {
        if (points.size() == 3) {
            return new Triangle(points);
        } else {
            return null;
        }
    }
    public Rectangle createRectangleIfPossible(List<Point> points) {
        if (points.size() == 4) {
            return new Rectangle(points);
        } else {
            return null;
        }
    }

}
