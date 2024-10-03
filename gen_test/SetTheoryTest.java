package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SetTheoryTest {

    @Test
    public void testGenerateSetWithinBounds() {
        List<Integer> expected = List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertEquals(expected, SetTheory.generateSet(10, 20));
    }

    @Test
    public void testGenerateSetEmptyWhenMinGteMax() {
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, SetTheory.generateSet(20, 10));
    }

    @Test
    public void testGenerateSetWithMinBelowZero() {
        List<Integer> expected = List.of(0, 1, 2, 3, 4);
        assertEquals(expected, SetTheory.generateSet(-5, 5));
    }

    @Test
    public void testGenerateSetWithMaxAbove100() {
        List<Integer> expected = List.of(95, 96, 97, 98, 99);
        assertEquals(expected, SetTheory.generateSet(95, 105));
    }
}