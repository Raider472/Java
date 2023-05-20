package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TD1Test {

    @Test
    void ex1() {
        assertEquals(5, TD1.ex1(25));
        assertNotEquals(6, TD1.ex1(25));
    }

    @Test
    void ex2() {
        assertEquals(25, TD1.ex2(25,10));
        assertNotEquals(10, TD1.ex2(25,10));
    }

    @Test
    void ex3() {
        int[] tableau = {1,2,50,89,7,45};
        assertEquals(194, TD1.ex3(tableau));
        assertNotEquals(195, TD1.ex3(tableau));
    }
}