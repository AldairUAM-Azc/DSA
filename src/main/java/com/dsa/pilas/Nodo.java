package com.dsa.pilas;

public class Nodo<T extends Comparable<T>> implements Comparable<Nodo<T>> {
  private T info;
  private Nodo<T> liga;

  public Nodo(T info) {
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

  @Override
  public int compareTo(Nodo<T> o) {
    return info.compareTo(o.getInfo());
  }
}
