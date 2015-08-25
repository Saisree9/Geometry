package com.thoughtWorks;

import org.junit.Assert;
import org.junit.Test;

public class LineTest {
    @Test
    public void goingFromZeroZeroToOneZeroHasLengthOne() {
        Line line = new Line(0, 0, 1, 0);
        Assert.assertEquals(1.0, line.calculateLength(), 0.001);
    }
}
