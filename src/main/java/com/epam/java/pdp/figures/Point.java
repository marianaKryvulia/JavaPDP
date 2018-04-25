package com.epam.java.pdp.figures;

public class Point {
   int x;
   int y;
    private static int pointsCount;

    public Point(int x, int y){
        pointsCount++;
        this.x = x;
        this.y = y;
    }

    int getPointsCount(){
        return pointsCount;
    }
}
