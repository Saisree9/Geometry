package com.thoughtworks;

public class Line {
    private Point startingPoint;
    private Point endingPoint;

    public Line(Point point1, Point point2) {
        this.startingPoint = point1;
        this.endingPoint = point2;
    }

    public double length() {
        return startingPoint.distanceFrom(endingPoint);
    }


    @Override
    public boolean equals(Object that) {
        if (that == null || !(that instanceof Line)) return false;
        Line thatLine = (Line) that;
        return compareTwoPointsInterchangibly(thatLine);
    }

    private boolean compareTwoPointsInterchangibly(Line thatLine) {
        return compareTwoPoints(thatLine.startingPoint, thatLine.endingPoint) || (compareTwoPoints(thatLine.endingPoint, thatLine.startingPoint));
    }

    private boolean compareTwoPoints(Point startingPoint, Point endingPoint) {
        return this.startingPoint.equals(startingPoint) && this.endingPoint.equals(endingPoint);
    }

    @Override
    public int hashCode() {
        return startingPoint.hashCode() * endingPoint.hashCode();
    }
}
