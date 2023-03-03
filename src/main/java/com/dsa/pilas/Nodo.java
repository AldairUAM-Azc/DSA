package com.dsa.pilas;

public class Nodo {
  private Object info;
  private Nodo liga;

  public Nodo(Object info) {
    liga = null;
  }

  public Nodo(Object info, Nodo liga) {
    this.info = info;
    this.liga = liga;
  }

  @Override
  public String toString() {
    return "Nodo [info=" + info + ", liga=" + liga + "]";
  }

  @Override
  protected Object clone() {
    return new Nodo(this.info, this.liga);
  }

  public Object getInfo() {
    return info;
  }

  public Nodo getLiga() {
    return liga;
  }
}
