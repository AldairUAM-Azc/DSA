package com.dsa.listas;


import com.dsa.nodos.NodoDoble;

public class ListaDoble {
  protected NodoDoble cabeza;

  // No repetidos
  // Orden ascendente
  public ListaDoble() {
    cabeza = null;
  }
  public NodoDoble getCabeza(){
    return cabeza;
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

  public void insertar(Comparable x) {
    NodoDoble ant = buscar(x);
    if (vacia()) {
      cabeza = new NodoDoble(x);
    } else if (ant == null) { // insert before head position
      NodoDoble nuevo = new NodoDoble(x, null, cabeza);
      cabeza.setPrev(nuevo);
      cabeza = nuevo;
    } else if (ant.getNext() == null) { // insert in last element position
      ant.setNext(new NodoDoble(x, ant, null));
    } else { // insert in between nodes
      NodoDoble nuevo = new NodoDoble(x, ant, ant.getNext());
      ant.setNext(nuevo);
      ant.getNext().setPrev(nuevo);
    }

  }

  void borrar(Comparable x) {
    NodoDoble target = buscar(x);
    if (vacia())
      System.out.println("Lista vacia. No se puede borrar nada.");
    else if (target == null || !target.getInfo().equals(x))
      System.out.println("Ese elemento no esta en la lista. No se puede borrar.");
    else if (target.getPrev() == null
        && target.getNext() == null) // delete the only element in the list
      cabeza = null;
    else if (target == cabeza) { // deletes head node
      target.getNext().setPrev(null);
      cabeza = target.getNext();
    } else if (target.getNext() == null) // delete last item in list
      target.getPrev().setNext(target.getNext());
    else { // delete node in between
      target.getPrev().setNext(target.getNext());
      target.getNext().setPrev(target.getPrev());
    }
  }

  public int longitud(){
    int n = 0;
    NodoDoble aux = cabeza;
    while(aux != null){
      n++;
      aux = aux.getNext();
    }
    return n;
  }

  public NodoDoble buscar(int i){
    NodoDoble aux = cabeza;
    if(vacia())
      return null;
    if(i > longitud()-1 || i < 0)
      throw new Error("Out of bounds");
    int n = 0;
    while(i > n){
      n++;
      aux = aux.getNext();
    }
    return aux;
  }

  public ListaDoble clonar(){
    NodoDoble aux = cabeza;
    ListaDoble clon = new ListaDoble();
    while(aux != null){
      clon.insertar(aux.getInfo());
      aux = aux.getNext();
    }
    return clon;
  }

  public int sumar(){
    NodoDoble aux = cabeza;
    int s = 0;
    while(aux != null){
      s += (Integer) |aux.getInfo();
      aux = aux.getNext();
    }
    return s;
  }

  public void sumarI(int i){
    NodoDoble aux = cabeza;
    while(aux != null){
      aux.setInfo((Integer) aux.getInfo() + i);
      aux = aux.getNext();
    }
  }

  public void sumarDerecha(){
    NodoDoble aux = cabeza;
    while(aux != null){
      if(aux.getNext() != null){
        aux.setInfo((Integer) aux.getInfo() + (Integer) aux.getNext().getInfo());
      } else { //last element in list doenst have a Next
        aux.setInfo((Integer) aux.getInfo() + (Integer) cabeza.getInfo());
      }
      aux = aux.getNext();
    }
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

    System.out.println(miLista.buscar(2));

    //sumar polinomios
    // crear una lizta enlazada para cada polinomio
    // sumarlos
  }
}
