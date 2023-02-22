package com.mycompany.tarea1;

import org.junit.Test;

import com.dsa.tarea1.Tarea1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Tarea1Test {
    public Tarea1Test() {
    }

    @Test
    public void testSuma() {
        assertTrue("5+5 = 10", Tarea1.suma(5, 5) == 10);
    }
    @Test
    public void testIsLeapYear(){
        assertTrue("2004 is LeapYear", Tarea1.isLeapYear(2004));
        assertTrue("1900 is not LeapYear", !Tarea1.isLeapYear(1900));
        assertTrue("2016 is LeapYear", Tarea1.isLeapYear(2016));
        assertTrue("2020 is LeapYear", Tarea1.isLeapYear(2020));
        assertTrue("2024 is LeapYear", Tarea1.isLeapYear(2024));
    }
    

    @Test
    public void testMore() {
        assertTrue(true);
    }
}

