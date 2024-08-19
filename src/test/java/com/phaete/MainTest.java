package com.phaete;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add_shouldReturn3_whenAdd1And2() {
        // 3 steps
        // Given -> Known values
        // When -> Operation
        // Then -> Result

        int a = 1;
        int b = 2;
        int expected = 3;
        assertEquals(expected, Main.add(a, b));
    }

    @Test
    void add_shouldReturn2_whenAdd1And1() {
        assertEquals(2, Main.add(1, 1));
    }

    @Test
    void add_shouldReturn4_whenAdd2And2() {
        assertEquals(4, Main.add(2, 2));
    }

    @Test
    void subtract() {
    }
}