package com.dsa.nodos;

public class NodoDoble {
  private Comparable info;
  private Nodo prev;
  private Nodo next;

  public NodoDoble(Comparable info) {
    this.info = info;
    prev = null;
    next = null;
  }

  public NodoDoble(Comparable info, Nodo prev, Nodo next) {
    this.info = info;
    this.prev = prev;
    this.next = next;
  }

  @Override
  public String toString() {
    return "Nodo [info=" + info + ", prev=" + prev + "next=" + next + "]";
  }

  public Comparable getInfo() {
    return info;
  }

  public void setInfo(Comparable info) {
    this.info = info;
  }

  public Nodo getPrev() {
    return prev;
  }

  public void setPrev(Nodo prev) {
    this.prev = prev;
  }

  public Nodo getNext() {
    return next;
  }

  public void setNext(Nodo next) {
    this.next = next;
  }

}
