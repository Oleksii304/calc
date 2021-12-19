package com.oleksii.calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    private Calc calc = new Calc();

    @Test
    void testSum() {
        assertEquals(5, calc.sum(2, 3));
    }

}
