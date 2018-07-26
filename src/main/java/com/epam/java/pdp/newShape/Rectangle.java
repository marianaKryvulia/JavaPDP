package com.epam.java.pdp.newShape;

import com.epam.java.pdp.figures.Line;
import com.epam.java.pdp.figures.Point;

import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Shape {

    List<Point> points;

    public List<Double> lineLegth() {
        List<Double> lineLength = new ArrayList<>();
        for (int i = 0; i < points.size(); i++) {
            Point start = points.get(i);
            int endIndex = i + 1;
            if (endIndex == points.size()) {
                endIndex = 0;
            }
            Point end = this.points.get(endIndex);
            Line line = new Line(start, end);
            double length = line.lineLength();
            lineLength.add(length);
        }
        return lineLength;
    }

    @Override
    public String shapeType() {
        return null;
    }

    @Override
    public double perimeter() {
        return 0;
    }


    public boolean isRectangleIquilateral(List<Double> lineLegth ){
        return true;
    }
}
