package com.dsa.nodos;

public class NodoDoble {
  private Comparable info;
  private NodoDoble prev;
  private NodoDoble next;

  public NodoDoble(Comparable info) {
    this.info = info;
    prev = null;
    next = null;
  }

  public NodoDoble(Comparable info, NodoDoble prev, NodoDoble next) {
    this.info = info;
    this.prev = prev;
    this.next = next;
  }

  @Override
  public String toString() {
    return "Nodo [info=" + info + ", prev=" + prev + ", next=" + next + "]";
  }

  public Comparable getInfo() {
    return info;
  }

  public void setInfo(Comparable info) {
    this.info = info;
  }

  public NodoDoble getPrev() {
    return prev;
  }

  public void setPrev(NodoDoble prev) {
    this.prev = prev;
  }

  public NodoDoble getNext() {
    return next;
  }

  public void setNext(NodoDoble next) {
    this.next = next;
  }

}
