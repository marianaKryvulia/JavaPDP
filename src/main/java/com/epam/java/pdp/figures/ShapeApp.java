package com.epam.java.pdp.figures;

import com.epam.java.pdp.figures.Point;

public class ShapeApp {

    public static void main(String[] args) {
        Shape triangle = new Shape();
        triangle.isTriangle();
        triangle.isTriangleRectangular();
        triangle.isTriangleIsosceles();
        System.out.println("Perimeter is: " + (triangle.a + triangle.b + triangle.c));

    }
}
