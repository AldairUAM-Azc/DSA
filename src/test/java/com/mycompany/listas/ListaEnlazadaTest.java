package com.mycompany.listas;

import org.junit.Test;

import com.dsa.pilas.PilaEstatica;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class ListaEnlazadaTest {
  
  @Test
  public void assertPopEmptyStackThrowsError() {
    PilaEstatica mypila = new PilaEstatica(3);
    assertThrows("Hasta aqui llego pa", Error.class, () -> mypila.pop());
  }

  @Test
  public void assertValTopeGetsObjectInStack() {
    PilaEstatica mypila = new PilaEstatica(3);
    mypila.push(Integer.valueOf(1));
    mypila.push(Integer.valueOf(2));
    assertTrue("Si guardo el objeto", mypila.valTope().equals(Integer.valueOf(2)));
  }
}