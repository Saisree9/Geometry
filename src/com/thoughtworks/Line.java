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
    public boolean equals(Object obj) {
        Line line = (Line) obj;
        if(obj == null)   return false;
        if (this.x1 == line.x1 && this.y1 == line.y1 && this.x2 == line.x2 && this.y2 == line.y2)
            return true;
        else if(this.x1 == line.x2 && this.y1 == line.y2 && this.x2 == line.x1 && this.y2 == line.y1)
            return true;
        return false;
    }
}
