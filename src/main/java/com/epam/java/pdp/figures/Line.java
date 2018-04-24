package com.epam.java.pdp.figures;
import com.epam.java.pdp.figures.Point;
public class Line {
    Point start;
    Point end;
    Line (Point startPoint, Point endPoint){
        if (startPoint == null || endPoint == null)
        {
           throw new RuntimeException();
        }
        this.start = startPoint;
        this.end = endPoint;
    }
    public double lineLength(Point start, Point end){
        double length = Math.sqrt((end.x - start.x)*(end.x - start.x) + (start.y - end.y)*(start.y - end.y));
        return length;
    }
}
