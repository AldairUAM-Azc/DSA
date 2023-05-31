package com.dsa.pilas;

import com.dsa.nodos.Nodo;

public class PilaDinamica {
  private Nodo tope;

  public PilaDinamica() {
    tope = null;
  }

  public boolean vacia() {
    return tope == null;
  }

  public void push(Comparable obj) {
    tope = new Nodo(obj, tope);
  }

  public Object pop() {
    if (vacia())
      throw new NoMoreElements("Ya no hay elementos.");
    Nodo popped = tope;
    tope = tope.getLiga();
    return popped.getInfo();
  }

  public Object valTope() {
    return tope.getInfo();
  }

  @Override
  public String toString() {
    if (vacia())
      return "[]";
    Nodo tempTope = tope;
    String separator = " -> ";
    String str = "[ ";
    while (tempTope != null) {
      str += tempTope.getInfo() + separator;
      tempTope = tempTope.getLiga();
    }
    return str.substring(0, str.length() - separator.length()) + " ]";
  }
}
