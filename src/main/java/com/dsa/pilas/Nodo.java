package com.dsa.pilas;

public class Nodo<T> {
  private T info;
  private Nodo<T> liga;

  public Nodo(T info) {
    this.info = info;
    liga = null;
  }

  public Nodo(T info, Nodo<T> liga) {
    this.info = info;
    this.liga = liga;
  }

  @Override
  public String toString() {
    return "Nodo [info=" + info + ", liga=" + liga + "]";
  }

  public T getInfo() {
    return info;
  }

  public Nodo<T> getLiga() {
    return liga;
  }
  public void setLiga(Nodo<T> l) {
    liga = l;
  }
}
