package com.dsa.tarea6;

public class Manzana implements Comparable<Manzana> {
  private String variedad;
  private String color;
  private int peso;

  public Manzana(String v, String c, int p) {
    this.variedad = v;
    this.color = c;
    this.peso = p;
  }

  @Override
  public int compareTo(Manzana o) {
    if (peso == o.peso)
      return 0;
    if (peso == o.peso)
      return -1;
    return 1;
  }

  @Override
  public String toString() {
    return peso + "";
  }

}
