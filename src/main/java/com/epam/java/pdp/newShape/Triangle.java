package com.epam.java.pdp.newShape;
import com.epam.java.pdp.figures.Point;
import com.epam.java.pdp.figures.Line;

import java.util.List;

public class Triangle implements Shape {

    String shapeType;
    List<Point> points;
    List<Double> lineLengths;
    public Triangle(List<Point> points){
        this.points = points;
    }

    public String shapeType() {

        return shapeType;
    }

    public double perimeter() {
        double perimeter = lineLengths.stream().mapToDouble(Double::doubleValue).sum();
        return perimeter;
    }

}
