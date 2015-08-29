package com.thoughtworks;

import static java.lang.Math.*;

public class Point {
    private double xCoordinate;
    private double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that)
            return true;
        else if (that == null || that.getClass() != this.getClass())
            return false;
        else {
            Point thatPoint = (Point) that;
            return this.xCoordinate == thatPoint.xCoordinate && this.yCoordinate == thatPoint.yCoordinate
                    && this.xCoordinate == thatPoint.xCoordinate && this.yCoordinate == thatPoint.yCoordinate;
        }
    }

    public double distanceFrom(Point point) {
        return sqrt(pow(this.xCoordinate - point.xCoordinate, 2) + pow(this.yCoordinate - point.yCoordinate, 2));
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(xCoordinate);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(yCoordinate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
