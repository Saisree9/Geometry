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
    public void shouldEqualToItself() {
        Line line = new Line(1, 0, 2, 0);
        assertEquals(line, line);
    }


}
