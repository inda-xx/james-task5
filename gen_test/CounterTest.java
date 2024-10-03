package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void testCounterIncrement() {
        Exercise2.Counter.increment();
        assertEquals(1, Exercise2.Counter.count);

        Exercise2.Counter.increment();
        assertEquals(2, Exercise2.Counter.count);
    }
}

// EnemiesTest.java

import org.junit.Test;
import static org.junit.Assert.*;

