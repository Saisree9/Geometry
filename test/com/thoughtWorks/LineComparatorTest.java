package com.thoughtWorks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LineComparatorTest {
    @Test
    public void shouldLineComparatorReturnTrueWhenTwoLinesHavingSameEndPoints() {
        Line line1 = new Line(1, 1, 1, 1);
        Line line2 = new Line(1, 1, 1, 1);
        LineComparator lineComparator = new LineComparator();
        boolean actual = lineComparator.compare(line1, line2);
        assertTrue(actual);
    }


}
