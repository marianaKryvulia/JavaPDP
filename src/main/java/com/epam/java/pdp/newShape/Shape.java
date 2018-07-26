package com.epam.java.pdp.newShape;

import java.util.ArrayList;
import java.util.List;
import com.epam.java.pdp.figures.Point;

interface Shape {
    List<Point> shapePoints = new ArrayList<Point>();
String shapeType();
double perimeter();

}
