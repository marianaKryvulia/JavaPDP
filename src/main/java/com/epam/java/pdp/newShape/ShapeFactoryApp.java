package com.epam.java.pdp.newShape;

import com.epam.java.pdp.figures.Point;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactoryApp {
    List<Point> shapePoints = new ArrayList<>();

    public static void main(String[] args) {
        ShapeFactoryApp sfa = new ShapeFactoryApp();
        ShapeFactory sf = new ShapeFactory();
        Triangle triangle = sf.createTriangleIfPossible(sfa.shapePoints);
        Rectangle rectangle = null;
        if (triangle == null){
            rectangle = sf.createRectangleIfPossible(sfa.shapePoints);
        }
        if (triangle != null){
            triangle.shapeType();
        }
        if (rectangle != null){
            rectangle.shapeType();
        }
    }
}
