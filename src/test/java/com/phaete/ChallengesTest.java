package com.phaete;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChallengesTest {

    @Test
    void sum_return3_whenSum1And2() {
        assertEquals(3, Challenges.sum(1, 2));
    }
    @Test
    void sum_return1_whenSumNeg1And2() {
        assertEquals(1, Challenges.sum(-1, 2));
    }

    @Test
    void isEven_returnTrue_whenEven2() {
        assertTrue(Challenges.isEven(2));
    }

    @Test
    void isEven_returnFalse_whenOdd3() {
        assertFalse(Challenges.isEven(3));
    }

    @Test
    void product_returns4_whenProduct2And2() {
        assertEquals(4, Challenges.product(2, 2));
    }

    @Test
    void product_returns9_whenProductNeg3AndNeg3() {
        assertEquals(9, Challenges.product(-3, -3));
    }

    @Test
    void toUpperCase_returnsABC_whenABC() {
        assertEquals("ABC", Challenges.toUpperCase("abc"));
    }

    @Test
    void toUpperCase_returnsCURRYWURST_whenCurrywurst() {
        assertEquals("CURRYWURST", Challenges.toUpperCase("Currywurst"));
    }

    @Test
    void isPositive_returnTrue_whenPositive2() {
        assertTrue(Challenges.isPositive(2));
    }

    @Test
    void isPositive_returnFalse_whenNegative2() {
        assertFalse(Challenges.isPositive(-2));
    }

}