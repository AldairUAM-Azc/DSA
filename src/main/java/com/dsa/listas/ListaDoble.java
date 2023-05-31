package com.dsa.listas;

import com.dsa.nodos.NodoDoble;

public class ListaDoble {
  private NodoDoble cabeza;

  // No repetidos
  // Orden ascendente
  public ListaDoble() {
    cabeza = null;
  }

  public boolean vacia() {
    return cabeza == null;
  }

  public NodoDoble buscar(Comparable x) {
    // si no lo encuentra regresa el anterior
    if (vacia())
      return null;
    NodoDoble ant = cabeza;
    while (ant.getNext() != null
        && ant.getInfo().compareTo(x) < 0)
      ant = ant.getNext();
    if (ant.getInfo().compareTo(x) > 0)
      return ant.getPrev();
    return ant;

  }

  void insertar(Comparable x) {
    NodoDoble ant = buscar(x);
    if (vacia()) {
      cabeza = new NodoDoble(x);
    } else if (ant == null) { //insert before head position
      NodoDoble nuevo = new NodoDoble(x, null, cabeza);
      cabeza.setPrev(nuevo);
      cabeza = nuevo;
    } else if (ant.getNext() == null) { //insert in last element position
      ant.setNext(new NodoDoble(x, ant, null));
    } else {  //insert in between nodes
      NodoDoble nuevo = new NodoDoble(x, ant, ant.getNext());
      ant.getNext().setPrev(nuevo);
      ant.setNext(nuevo);
    }

  }

  void borrar(Comparable x) {
    throw new Error("Not implemented yet");

  }

  @Override
  public String toString() {
    String str = "[ ";
    NodoDoble aux = cabeza;
    while (aux != null) {
      str += aux.getInfo() + " ";
      aux = aux.getNext();
    }
    return str + "]";
  }

  public static void main(String[] args) {
    ListaDoble miLista = new ListaDoble();
    System.out.println(miLista);
    miLista.insertar(3);
    System.out.println(miLista);
    miLista.insertar(1);
    System.out.println(miLista);
    miLista.insertar(4);
    System.out.println(miLista);
    miLista.insertar(2);
    System.out.println(miLista);
  }
}
