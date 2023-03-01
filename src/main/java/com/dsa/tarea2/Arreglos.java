package com.dsa.tarea2;

import java.util.Scanner;

public class Arreglos {
  int[] info;

  public Arreglos() {
    System.out.println("Tamanio: ");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    this.info = new int[n];

    for (int i = 0; i < info.length; i++) {
      System.out.println("Numero posicion " + i +": ");
      info[i] = s.nextInt();
    }
    s.close();
  }

  public int cuentaPositivos() {
    int cuenta = 0;
    for (int n : this.info) {
      if (n > 0)
        cuenta++;
    }
    return cuenta;
  }

  public int cuentaNegativos() {
    int cuenta = 0;
    for (int n : this.info) {
      if (n < 0)
        cuenta++;
    }
    return cuenta;
  }

  public int cuentaPares() {
    int cuenta = 0;
    for (int n : this.info) {
      if (n % 2 == 0)
        cuenta++;
    }
    return cuenta;
  }

  public int cuentaImpares() {
    int cuenta = 0;
    for (int n : this.info) {
      if (n % 2 == 1 || n % 2 == -1)
        cuenta++;
    }
    return cuenta;
  }

  public int cuentaCeros() {
    int cuenta = 0;
    for (int n : this.info) {
      if (n == 0)
        cuenta++;
    }
    return cuenta;
  }

  public int cuentaParesPositivos() {
    int cuenta = 0;
    for (int n : this.info) {
      if (n > 0 && n % 2 == 0)
        cuenta++;
    }
    return cuenta;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("[ ");
    for (int i : info) {
      sb.append(i).append(" ");
    }
    sb.append("]");
    return sb.toString();
  }

}
