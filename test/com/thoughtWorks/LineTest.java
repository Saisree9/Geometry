package com.thoughtWorks;

import com.thoughtWorks.Line;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTest {
    @Test
    public void goingFromZeroZeroToOneZeroHasLengthOne() {
        Line line = new Line(0, 0, 1, 0);
        Assert.assertEquals(1.0, line.calculateLength(), 0.001);
    }
}
