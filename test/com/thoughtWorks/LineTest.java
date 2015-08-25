package com.thoughtWorks;

import org.junit.Assert;
import org.junit.Test;

public class LineTest {
    @Test
    public void lengthShouldBeOneWhenOneEndPointOfTheLineIsZeroZeroAndAnotherPointIsOneZero() {
        Line line = new Line(0, 0, 1, 0);
        Assert.assertEquals(1.0, line.calculateLength(), 0.001);
    }

    @Test
    public void shouldReturnFourWhenPointsOfTheLineGivenAsOneZeroAndFourZero() {
        Line line = new Line(0, 0, 4, 0);
        Assert.assertEquals(4.0, line.calculateLength(), 0.001);
    }

}
