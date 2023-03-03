package com.dsa.tarea2;

import java.util.Scanner;

public class Arreglo {
  int[] info;

  public Arreglo() {
    System.out.println("Tamanio del arreglo: ");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    this.info = new int[n];

    for (int i = 0; i < info.length; i++) {
      System.out.println("Numero posicion " + i +": ");
      info[i] = s.nextInt();
    }
    s.close();
  }

  public static void main(String[] args){
    Arreglo miArreglo = new Arreglo();
    System.out.println("\nEste es tu arreglo de numeros\n" + miArreglo.toString() + "\n");
    System.out.println("El arreglo tiene:");
    System.out.println("a. " + miArreglo.cuentaPositivos() + " numeros positivos");
    System.out.println("b. " + miArreglo.cuentaNegativos() + " numeros negativos");
    System.out.println("c. " + miArreglo.cuentaPares() + " numeros pares");
    System.out.println("d. " + miArreglo.cuentaImpares() + " numeros impares");
    System.out.println("e. " + miArreglo.cuentaParesPositivos() + " numeros positivos y pares");
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
