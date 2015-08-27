package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by saisree on 8/27/15.
 */
public class PointTest {
    @Test
    public void shouldEqualWhichIsHavingSameXCordinateAndYCoordinate() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        assertEquals(point1,point2);
    }
}
