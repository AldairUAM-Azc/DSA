package com.mycompany.pilas;

import org.junit.Test;

import com.dsa.pilas.PilaEstatica;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;


public class PilaEstaticaTest {
    public PilaEstaticaTest() {
    }

    @Test
    public void assertPopEmptyStackThrowsError() {
        PilaEstatica mypila = new PilaEstatica(3);
        assertThrows("Hasta aqui llego pa", Error.class, () -> mypila.pop());
    }
    @Test
    public void assertPushSavesObjectInStack() {
        PilaEstatica mypila = new PilaEstatica(3);
        mypila.push(Integer.valueOf(1));
        assertTrue("Si guardo el objeto", mypila.valTope().equals(Integer.valueOf(1)));
    }
    @Test
    public void assertValTopeGetsObjectInStack() {
        PilaEstatica mypila = new PilaEstatica(3);
        mypila.push(Integer.valueOf(1));
        mypila.push(Integer.valueOf(2));
        assertTrue("Si guardo el objeto", mypila.valTope().equals(Integer.valueOf(2)));
    }
    @Test
    public void assertPushFullStackThrowsError() {
        PilaEstatica mypila = new PilaEstatica(3);
        for (int i = 0; i < 3; i++) {
            mypila.push(Integer.valueOf(i));
        }

        assertThrows("No cabe pa", Error.class, () -> mypila.push(Integer.valueOf(3)));
    }
    
}

