package com.dsa.listas;

import com.dsa.nodos.Nodo;

public class ListaLigada {
  protected Nodo cabeza;

  public ListaEnlazada() {
    cabeza = null;
  }

  public boolean vacia() {
    return cabeza == null;
  }

  public Nodo busca(Comparable x) {
    Nodo aux = cabeza;
    while (aux != null && aux.getInfo().compareTo(x) < 0)
      aux = aux.getLiga();
    return aux;
  }

  public int longitud() {
    Nodo aux = cabeza;
    int longitud = 0;
    while (aux != null) {
      longitud++;
      aux = aux.getLiga();
    }
    return longitud;
  }

  public Nodo anterior(Nodo n) {
    Nodo aux = cabeza;
    while (aux != null && aux.getLiga() != n) {
      aux = aux.getLiga();
    }
    return aux;
  }

  public void insertar(Comparable x) {
    if (vacia())
      cabeza = new Nodo(x);
    else {
      Nodo nodoDerecha = busca(x);
      if (nodoDerecha != null && nodoDerecha.getInfo().equals(x))
        System.out.println("El elemeento '" + x + "' ya esta en la lista. No se admiten duplicados");
      else if (nodoDerecha == cabeza) {
        cabeza = new Nodo(x, cabeza);
      } else {
        Nodo nodoIzquierda = anterior(nodoDerecha);
        nodoIzquierda.setLiga(new Nodo(x, nodoDerecha));
      }
    }
  }

  void borrar(Comparable x) {
    Nodo nodo = busca(x);
    if (nodo == null || !nodo.getInfo().equals(x))
      System.out.println("Elemento no se puede borrar.");
    else if (nodo == cabeza) {
      cabeza = nodo.getLiga();
    } else {
      Nodo anterior = anterior(nodo);
      anterior.setLiga(nodo.getLiga());
    }
  }

  public Nodo getCabeza() {
    return cabeza;
  };

  @Override
  public String toString() {
    String str = "[ ";
    Nodo aux = cabeza;
    while (aux != null) {
      str += aux.getInfo() + " ";
      aux = aux.getLiga();
    }
    str += "]";
    return str;
  }
}