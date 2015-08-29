package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void shouldEqualToItself() {
        Point point = new Point(1, 2);

        assertEquals(point, point);
    }

    @Test
    public void shouldNotEqualToNull() {
        Point point1 = new Point(1, 2);

        assertNotEquals(point1, null);
    }

    @Test
    public void shouldEqualAnotherPointWhichIsHavingSameXCordinateAndYCoordinate() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        assertEquals(point1, point2);
    }


    @Test
    public void shouldNotEqualToAnotherPointWhenDifferentHashCode() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(2, 2);

        assertNotEquals(point1, point2);
    }

    @Test
    public void shouldEqualToAnotherPointWhenSamehashCode() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);

        assertEquals(point1,point2);
    }
}
