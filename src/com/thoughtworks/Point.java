package com.thoughtworks;

public class Point {
    private double xCoordinate;
    private double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public boolean isEqual(Point that) {
        return this.xCoordinate == that.xCoordinate && this.yCoordinate == that.yCoordinate
                && this.xCoordinate == that.xCoordinate && this.yCoordinate == that.yCoordinate;
    }
}
