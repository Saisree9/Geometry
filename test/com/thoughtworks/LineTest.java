package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {

    @Test
    public void shouldReturnLengthOfLineZero() {
        Point point1 = new Point(1.0, 1.0);
        Point point2 = new Point(1.0, 1.0);
        Line line = new Line(point1, point2);

        assertEquals(0.0d, line.length(), 0.0d);
    }

    @Test
    public void shouldReturnLengthOfVerticalLineOne() {
        Point point1 = new Point(1.0, 1.0);
        Point point2 = new Point(1.0, 2.0);
        Line line = new Line(point1, point2);

        assertEquals(1.0d, line.length(), 0.0d);
    }

    @Test
    public void shouldReturnLengthOfVerticalLineOneHavingNegativeCoordinates() {
        Point point1 = new Point(1.0, 1.0);
        Point point2 = new Point(-1.0, -2.0);
        Line line = new Line(point1, point2);

        assertEquals(3.605, line.length(), 0.2d);
    }

    @Test
    public void shouldReturnLengthOfHorizontalLineOne() {
        Point point1 = new Point(1.0, 2.0);
        Point point2 = new Point(1.0, 1.0);
        Line line = new Line(point1, point2);

        assertEquals(1.0d, line.length(), 0.0d);
    }

    @Test
    public void shouldReturnLengthOfHorizontalLineOneHavingNegativeCoordinates() {
        Point point1 = new Point(-1.0, -2.0);
        Point point2 = new Point(1.0, 1.0);
        Line line = new Line(point1, point2);

        assertEquals(3.605, line.length(), 0.2d);
    }

    @Test
    public void shouldReturnLengthOfLinePassingThroughOrigin() {
        Point point1 = new Point(0.0, 3.0);
        Point point2 = new Point(0.0, 4.0);
        Line line = new Line(point1, point2);

        assertEquals(1.0d, line.length(), 0.0d);
    }


    @Test
    public void shouldEqualsToItself() {
        Point point1 = new Point(1.0, 0.0);
        Point point2 = new Point(2.0, 0.0);
        Line line = new Line(point1, point2);

        assertEquals(line, line);
    }

    @Test
    public void shouldEqualsToAnotherLineWhichHasSameCoordinates() {
        Point point1 = new Point(1.0, 0.0);
        Point point2 = new Point(2.0, 0.0);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point1, point2);

        assertEquals(line1, line2);
    }

    @Test
    public void shouldEqualsToAnotherLineWhichHasSwapedCoordinates() {
        Point point1 = new Point(1.0, 0.0);
        Point point2 = new Point(2.0, 0.0);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point2, point1);

        assertEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToNull() {
        Point point1 = new Point(1.0, 0.0);
        Point point2 = new Point(2.0, 0.0);
        Line line1 = new Line(point1, point2);
        assertNotEquals(line1, null);
    }

    @Test
    public void shouldNotEqualsToAnotherLineWhichHasDifferentX1Points() {
        Point startingPointOfLineOne = new Point(1, 2);
        Point startingPointOfLineTwo = new Point(4, 2);
        Point endingPointOfLineOne = new Point(3, 4);
        Point endingPointOfLineTwo = new Point(3, 4);
        Line line1 = new Line(startingPointOfLineOne, endingPointOfLineOne);
        Line line2 = new Line(startingPointOfLineTwo, endingPointOfLineTwo);

        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToAnotherLineWhichHasDifferentY1Points() {
        Point startingPointOfLineOne = new Point(1, 2);
        Point startingPointOfLineTwo = new Point(1, 4);
        Point endingPointOfLineOne = new Point(3, 4);
        Point endingPointOfLineTwo = new Point(3, 4);
        Line line1 = new Line(startingPointOfLineOne, endingPointOfLineOne);
        Line line2 = new Line(startingPointOfLineTwo, endingPointOfLineTwo);

        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToAnotherLineWhichHasDifferentX2Points() {
        Point startingPointOfLineOne = new Point(1, 2);
        Point startingPointOfLineTwo = new Point(1, 2);
        Point endingPointOfLineOne = new Point(3, 4);
        Point endingPointOfLineTwo = new Point(4, 4);
        Line line1 = new Line(startingPointOfLineOne, endingPointOfLineOne);
        Line line2 = new Line(startingPointOfLineTwo, endingPointOfLineTwo);

        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToAnotherLineWhichHasDifferentY2Points() {
        Point startingPointOfLineOne = new Point(1, 2);
        Point startingPointOfLineTwo = new Point(1, 2);
        Point endingPointOfLineOne = new Point(3, 4);
        Point endingPointOfLineTwo = new Point(3, 5);
        Line line1 = new Line(startingPointOfLineOne, endingPointOfLineOne);
        Line line2 = new Line(startingPointOfLineTwo, endingPointOfLineTwo);

        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToAnotherLineWhichHasDifferentHashCode(){
        Point startingPointOfLineOne = new Point(1, 2);
        Point startingPointOfLineTwo = new Point(2, 2);
        Point endingPointOfLineOne = new Point(3, 4);
        Point endingPointOfLineTwo = new Point(4, 4);
        Line line1 = new Line(startingPointOfLineOne, endingPointOfLineOne);
        Line line2 = new Line(startingPointOfLineTwo, endingPointOfLineTwo);

        assertNotEquals(line1,line2);


    }


}
