package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArraysTest {

    @Test
    public void testAverageWithPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        int expected = 3;
        assertEquals(expected, Arrays.average(array));
    }

    @Test
    public void testAverageWithNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        int expected = -3;
        assertEquals(expected, Arrays.average(array));
    }

    @Test
    public void testAverageWithMixedNumbers() {
        int[] array = {-1, 0, 1};
        int expected = 0;
        assertEquals(expected, Arrays.average(array));
    }

    @Test
    public void testAverageWithSingleElement() {
        int[] array = {5};
        int expected = 5;
        assertEquals(expected, Arrays.average(array));
    }

    @Test
    public void testAverageWithEmptyArray() {
        int[] array = {};
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Arrays.average(array);
        });
        assertEquals("/ by zero", exception.getMessage());
    }
}
```

```java
// File: SetTheoryTest.java
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

