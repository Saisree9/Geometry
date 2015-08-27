package com.thoughtworks;

import static java.lang.Math.*;

public class Line {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length() {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    @Override
    public boolean equals(Object that) {
        if (that == null || !(that instanceof Line)) return false;
        Line thatLine = (Line) that;
        return compareTwoCoordinatesInterchangibly(thatLine.x1, thatLine.y1, thatLine.x2, thatLine.y2);
    }

    private boolean compareTwoCoordinatesInterchangibly(double x11, double y11, double x21, double y21) {
        return compareTwoCoordinatePairs(x11, y11, x21, y21) || compareTwoCoordinatePairs(x21, y21, x11, y11);
    }

    private boolean compareTwoCoordinatePairs(double x11, double y11, double x21, double y21) {
        return this.x1 == x11 && this.y1 == y11 && this.x2 == x21 && this.y2 == y21;
    }
}
