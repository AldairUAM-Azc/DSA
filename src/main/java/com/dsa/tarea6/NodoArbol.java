package com.dsa.tarea6;

public class NodoArbol implements Comparable<NodoArbol> {
  private Comparable info;
  private NodoArbol hijoIzq;
  private NodoArbol hijoDer;

  public NodoArbol(Comparable info) {
    this.info = info;
    this.hijoIzq = null;
    this.hijoDer = null;
  }

  public Comparable getInfo() {
    return info;
  }

  public void setInfo(Comparable info) {
    this.info = info;
  }

  public NodoArbol getHijoIzq() {
    return hijoIzq;
  }

  public void setHijoIzq(NodoArbol hijoIzq) {
    this.hijoIzq = hijoIzq;
  }

  public NodoArbol getHijoDer() {
    return hijoDer;
  }

  public void setHijoDer(NodoArbol hijoDer) {
    this.hijoDer = hijoDer;
  }

  @Override
  public int compareTo(NodoArbol o) {
    if (this.info.compareTo(o.getInfo()) == 0)
      return 0;
    if (this.info.compareTo(o.getInfo()) > 0)
      return 1;
    if (this.info.compareTo(o.getInfo()) < 0)
      return -1;
  }
}