package com.dsa.pilas;

import com.dsa.nodos.Nodo;

public class PilaDinamica<T> {
  private Nodo<Object> tope;

  public PilaDinamica() {
    tope = null;
  }

  public boolean vacia() {
    return tope == null;
  }

  public void push(T obj) {
    tope = new Nodo<Object>(obj, tope);
  }

  public Object pop() {
    if (vacia())
      throw new NoMoreElements("Ya no hay elementos.");
    Nodo<Object> popped = tope;
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
    Nodo<Object> tempTope = tope;
    String separator = " -> ";
    String str = "[ ";
    while (tempTope != null) {
      str += tempTope.getInfo() + separator;
      tempTope = tempTope.getLiga();
    }
    return str.substring(0, str.length() - separator.length()) + " ]";
  }
}
