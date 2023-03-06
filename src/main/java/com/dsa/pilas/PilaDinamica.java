package com.dsa.pilas;

import java.util.Stack;

import javax.naming.LimitExceededException;

public class PilaDinamica {
  private Nodo tope;

  PilaDinamica() {
    tope = null;
  }

  public boolean vacia() {
    return tope == null;
  }

  public void push(Object obj) {
    tope = new Nodo(obj, tope);
  }

  public Object pop() {
    if (vacia())
      throw new StackNoMoreElements("Ya no hay elementos.");
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
