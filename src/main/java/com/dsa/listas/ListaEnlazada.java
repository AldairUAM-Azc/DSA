package com.dsa.listas;

import com.dsa.pilas.Nodo;

/**
 * Lista
 */
public class ListaEnlazada<T extends Comparable<T>> {
  private Nodo<T> cabeza;

  // ascendent list
  // no duplicates
  public ListaEnlazada() {
    cabeza = null;
  }

  public boolean vacia() {
    return cabeza == null;
  }

  public Nodo<T> busca(T x) {
    Nodo<T> aux = cabeza;
    while (aux != null && aux.getInfo().compareTo(x) < 0) {
      aux = aux.getLiga();
    }
    return aux;
  }

  private Nodo<T> anterior(Nodo<T> n) {
    Nodo<T> aux = cabeza;
    while (aux != null
        && aux.getLiga() != n) {
      aux = aux.getLiga();
    }
    return aux;
  }

  void inserta(T x) {
    if (vacia())
      cabeza = new Nodo<T>(x);
    else {
      Nodo<T> nodoDerecha = busca(x);
      if (nodoDerecha != null
          && nodoDerecha.getInfo().equals(x)) {
        System.out.println("El elemeento '" + x + "' ya esta en la lista. No se admiten duplicados");
      } else if (nodoDerecha == cabeza) {
        cabeza = new Nodo<T>(x, cabeza);
      } else { // inserta node en medio o al final de la lista
        Nodo<T> nodoIzquierda = anterior(nodoDerecha);
        nodoIzquierda.setLiga(new Nodo<T>(x, nodoDerecha));
      }
    }
  }

  void borrar(T x) {
    Nodo<T> nodo = busca(x);
    if (nodo == null || !nodo.getInfo().equals(x)) {
      System.out.println("Elemento no existe");
    } else if (nodo == cabeza) {
      cabeza = nodo.getLiga();
    } else { // borrar nodo en medio o al final de la lista
      Nodo<T> anterior = anterior(nodo);
      anterior.setLiga(nodo.getLiga());
    }
  }

  @Override
  public String toString() {
    String str = new String("[ ");
    Nodo<T> aux = cabeza;
    while (aux != null) {
      str += aux.getInfo() + " ";
      aux = aux.getLiga();
    }
    str += "]";
    return str;
  }

  public static void main(String[] args) {
    ListaEnlazada<Integer> miLista = new ListaEnlazada<>();
    System.out.println(miLista);
    miLista.inserta(2);
    miLista.inserta(3);
    miLista.inserta(1);
    System.out.println(miLista);
    miLista.borrar(1);
    miLista.borrar(1);
    miLista.borrar(2);
    miLista.borrar(3);
    System.out.println(miLista);
  }
}