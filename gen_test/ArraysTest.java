package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArraysTest {

    @Test
    public void testAverageWithPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        double expected = 3.0;
        assertEquals(expected, Arrays.average(array), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageEmptyArray() {
        int[] array = {};
        Arrays.average(array);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageNullArray() {
        Arrays.average(null);
    }

    @Test
    public void testAverageWithNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        double expected = -3.0;
        assertEquals(expected, Arrays.average(array), 0.001);
    }
}

// File name: SetTheoryTest.java

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

