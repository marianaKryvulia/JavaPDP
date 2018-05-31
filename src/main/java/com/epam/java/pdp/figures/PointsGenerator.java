package com.epam.java.pdp.figures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PointsGenerator {
    List<Point> points = new ArrayList<>();

    public void createBunchOfPoints() {
        final int randomCount = new Random().nextInt(200);
        for (int i = 0; i < randomCount; i++) {
            final Point point = new Point(i, i + 1);
            points.add(point);
        }
    }
}
