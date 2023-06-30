package com.dsa.filas;

import com.dsa.nodos.Nodo;

public class Fila {
  Nodo ultimo;

  public Fila() {
    ultimo = null;
  }

  public static void main(String[] args) {
    Fila miFila = new Fila();
    System.out.println(miFila);
    miFila.enqueue(3);
    miFila.enqueue(6);
    miFila.enqueue(1);
    miFila.enqueue(15);
    System.out.println(miFila);
    miFila.dequeue();
    System.out.println(miFila);
    miFila.dequeue();
    System.out.println(miFila);
    miFila.dequeue();
    System.out.println(miFila);
    miFila.dequeue();
    System.out.println(miFila);
  }

  public boolean vacia() {
    return ultimo == null;
  }

  public void enqueue(Comparable x) {
    if (vacia()) {
      ultimo = new Nodo(x, ultimo);
      ultimo.setLiga(ultimo);
    } else {
      ultimo.setLiga(new Nodo(x, ultimo.getLiga()));
      ultimo = ultimo.getLiga();
    }
  }

  public void dequeue() {
    if (vacia()) {
      throw new Error("Esta vacia");
    } else {
      Nodo frente = ultimo.getLiga();
      if (frente == ultimo)
        ultimo = null;
      else
        ultimo.setLiga(frente.getLiga());
    }
  }

  public Object valorFrente() {
    if (vacia()) {
      throw new Error("fila vacia");
    } else {
      return ultimo.getLiga().getInfo();
    }
  }

  @Override
  public String toString() {
    if (vacia())
      return "Fila vacia";
    String str = "[ ";
    Nodo aux = ultimo.getLiga();
    while (aux != ultimo) {
      str += aux.getInfo() + " ";
      aux = aux.getLiga();
    }
    return str + ultimo.getInfo() + " ]";
  }

}