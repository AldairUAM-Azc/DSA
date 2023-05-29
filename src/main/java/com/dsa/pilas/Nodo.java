package com.dsa.pilas;

public class Nodo {
  private Comparable info;
  private Nodo liga;

  public Nodo(Comparable info) {
    this.info = info;
    liga = null;
  }

  public Nodo(Comparable info, Nodo liga) {
    this.info = info;
    this.liga = liga;
  }

  @Override
  public String toString() {
    return "Nodo [info=" + info + ", liga=" + liga + "]";
  }

  public Comparable getInfo() {
    return info;
  }

  public Nodo getLiga() {
    return liga;
  }
  public void setLiga(Nodo l) {
    liga = l;
  }
}
