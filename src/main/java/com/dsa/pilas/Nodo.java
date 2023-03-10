package com.dsa.pilas;

public class Nodo<T> {
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

  

  @Override
  protected Object clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    return super.clone();
  }

  public T getInfo() {
    return info;
  }

  public Nodo<T> getLiga() {
    return liga;
  }
}
