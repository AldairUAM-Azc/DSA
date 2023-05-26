package com.dsa.filas;

import java.util.Scanner;

class Fila {
  private int[] info;
  private int ultimo;

  // elementos repetidos
  // asi como llegan asi se ordenan
  public Fila() {
    ultimo = 0;
    System.out.println("Tamanio maximo: ");
    Scanner s = new Scanner(System.in);
    int max = s.nextInt();
    s.close();
    info = new int[max];
  }

  public Fila(int max) {
    ultimo = 0;
    info = new int[max];
  }

  public boolean vacia() {
    return ultimo == -1;
  };

  public int buscar(int x) {
    int i = 0;
    while (i <= ultimo
        && x - info[i] < 0) { // This Integer casting is BS, Fix it asap
      i++;
    }
    return i;
  }

  public void insertar(int x) {
    if (ultimo >= info.length - 1) {
      System.out.println("Nos quedamos sin espacio mano");
    } else {
      int pos = buscar(x);
      if (info[pos] == x) {
        System.out.println("El elemento '" + x + "' ya existe");
        return;
      }
      int aux = ++ultimo;
      while (aux > pos) { // shift the elements passing the newly added element
        info[aux] = info[aux - 1];
        aux--;
      }
      info[pos] = x;
    }
  }

  public void borrar(int x) {
    int p = buscar(x);
    if (!(info[p] == x)) {
      System.out.println("Error: ele elemento no se encuentra");
    } else {
      for (int i = p; i <= ultimo - 2; i++) {
        info[i] = info[i + 1];
      }
      ultimo--;
    }
  }

  @Override
  public String toString() {
    String str = new String("[ ");
    for (int i = 0; i < ultimo; i++) {
      str += info[i] + " ";
    }
    return str + "]";
  }

  public static void main(String[] args) {
    Fila miFila = new Fila(5);
    miFila.insertar(2);
    miFila.insertar(4);
    miFila.insertar(6);
    System.out.println(miFila);
    miFila.borrar(6);
    System.out.println(miFila);
    miFila.borrar(2);
    System.out.println(miFila);
  }

}