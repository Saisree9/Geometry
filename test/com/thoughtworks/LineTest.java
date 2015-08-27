package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {

    @Test
    public void shouldReturnLengthOfLineZero() {
        Line line = new Line(1.0, 1.0, 1.0, 1.0);
        assertEquals(0.0d, line.length(), 0.0d);
    }

    @Test
    public void shouldReturnLengthOfVerticalLineOne() {
        Line line = new Line(1.0, 1.0, 1.0, 2.0);
        assertEquals(1.0d, line.length(), 0.0d);
    }

    @Test
    public void shouldReturnLengthOfVerticalLineOneHavingNegativeCoordinates() {
        Line line = new Line(1, 1, -1, -2);
        assertEquals(3.605, line.length(), 0.2d);
    }

    @Test
    public void shouldReturnLengthOfHorizontalLineOne() {
        Line line = new Line(1, 2, 1, 1);
        assertEquals(1.0d, line.length(), 0.0d);
    }

    @Test
    public void shouldReturnLengthOfHorizontalLineOneHavingNegativeCoordinates() {
        Line line = new Line(-1, -2, 1, 1);
        assertEquals(3.605, line.length(), 0.2d);
    }

    @Test
    public void shouldReturnLengthOfLinePassingThroughOrigin() {
        Line line = new Line(0, 3, 0, 4);
        assertEquals(1.0d, line.length(), 0.0d);
    }


    @Test
    public void shouldEqualsToItself() {
        Line line = new Line(1, 0, 2, 0);
        assertEquals(line, line);
    }

    @Test
    public void shouldEqualsToAnotherLineWhichHasSameCoordinates() {
        Line line1 = new Line(1, 0, 2, 0);
        Line line2 = new Line(1, 0, 2, 0);
        assertEquals(line1, line2);
    }

    @Test
    public void shouldEqualsToAnotherLineWhichHasSwapedCoordinates() {
        Line line1 = new Line(1, 0, 2, 0);
        Line line2 = new Line(2, 0, 1, 0);
        assertEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToNull() {
        Line line1 = new Line(1, 0, 2, 0);
        assertNotEquals(line1, null);
    }

    @Test
    public void shouldNotEqualsToAnotherLineWhichHasDifferentX1Points() {
        Line line1 = new Line(1, 2, 3, 4);
        Line line2 = new Line(4, 2, 3, 4);
        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToAnotherLineWhichHasDifferentY1Points() {
        Line line1 = new Line(1, 2, 3, 4);
        Line line2 = new Line(1, 4, 3, 4);
        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToAnotherLineWhichHasDifferentX2Points() {
        Line line1 = new Line(1, 2, 3, 4);
        Line line2 = new Line(1, 2, 4, 4);
        assertNotEquals(line1, line2);
    }

    @Test
    public void shouldNotEqualsToAnotherLineWhichHasDifferentY2Points() {
        Line line1 = new Line(1, 2, 3, 4);
        Line line2 = new Line(1, 4, 3, 5);
        assertNotEquals(line1, line2);
    }
}
