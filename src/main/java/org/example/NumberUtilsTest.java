package org.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class NumberUtilsTest {

    @Test
    public void testIsEven() {
        NumberUtils utils = new NumberUtils();
        assertTrue("4 deveria ser um número par", utils.isEven(4));
    }

    @Test
    public void testIsOdd() {
        NumberUtils utils = new NumberUtils();
        assertFalse("5 não deveria ser um número par", utils.isEven(5));
    }
}

