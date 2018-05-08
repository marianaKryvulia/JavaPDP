package com.epam.java.pdp.figures;

import java.util.Collections;

public class ShapeApp {

    public static void main(String[] args) {
        final Point p1 = new Point(1, 1);
        final Point p2 = new Point(1, 2);
        final Point p3 = new Point(2, 1);
        Shape triangle = new Shape(p1, p2, p3);
        triangle.isTriangle();
        triangle.isTriangleRectangular();
        triangle.isTriangleIsosceles();
//        System.out.println("Perimeter is: " + (triangle.a + triangle.b + triangle.c));
//        List<Point> points = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            final Point point = new Point(i, i + 1);
//            points.add(point);
//        }
//
//        PointsGenerator pointsGenerator = new PointsGenerator();
//        pointsGenerator.craeteBunchOfPoints();
//        pointsGenerator.craeteBunchOfPoints();
//        pointsGenerator.craeteBunchOfPoints();
//        pointsGenerator.craeteBunchOfPoints();
//        pointsGenerator.craeteBunchOfPoints();
//        pointsGenerator.craeteBunchOfPoints();
//        pointsGenerator.craeteBunchOfPoints();
//        pointsGenerator.craeteBunchOfPoints();
//        pointsGenerator.craeteBunchOfPoints();
//        pointsGenerator.craeteBunchOfPoints();
//        pointsGenerator.craeteBunchOfPoints();
//
//        final int allPointsCount = new Point(1, 1).getPointsCount();
//        System.out.println("Count of all points="+allPointsCount);
    }
}
