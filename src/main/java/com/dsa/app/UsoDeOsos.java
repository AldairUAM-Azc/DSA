package com.dsa.app;

public class UsoDeOsos {
  public static void main(String[] args) {
    Oso oscar = new Oso("Rolando","Pardo", 12);
    Oso baloo = new Oso("Baloo", "Negro", 16);
    Oso paddington = new Oso("Paddington", "chiquito", 3);

    Gato tom = new Gato("Tom");
    Gato garfield = new Gato("Garfield");

    Object[] animales = new Object[5];
    animales[0] = oscar;
    animales[1] = baloo;
    animales[2] = paddington;
    animales[3] = tom;
    animales[4] = garfield;

    for (Object obj : animales) {
      System.out.println(obj);
    }
  }
}
