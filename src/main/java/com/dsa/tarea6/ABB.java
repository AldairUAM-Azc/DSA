package com.dsa.tarea6;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import com.dsa.filas.Fila;

public class ABB {
  private NodoArbol raiz;

  public ABB() {
    this.raiz = null;
  }

  public static void main(String[] args) {
    // 2.
    ABB abb = new ABB();
    abb.insertar(2);
    abb.insertar(4);
    abb.insertar(6);
    abb.insertar(8);
    abb.insertar(10);
    abb.insertar(12);
    abb.insertar(14);
    abb.insertar(16);
    System.out.println("preorden---");
    abb.preorden(abb.getRaiz());
    System.out.println("\npostorden---");
    abb.postorden(abb.getRaiz());
    abb.insertar(10);
    abb.insertar(5);
    System.out.println("\ninorden---");
    abb.inorden(abb.getRaiz());

    // 3.
    abb = new ABB();
    abb.insertar(50);
    abb.insertar(40);
    abb.insertar(30);
    abb.insertar(20);
    abb.insertar(10);
    abb.insertar(5);
    System.out.println("preorden---");
    abb.preorden(abb.getRaiz());
    System.out.println("\npostorden---");
    abb.postorden(abb.getRaiz());
    System.out.println("\ninorden---");
    abb.inorden(abb.getRaiz());
    System.out.println("\n\n");

    // 4.
    abb = new ABB();
    // inserta en el arbol 20 numeros aleatorios sin repetirlos
    List<Integer> list = new ArrayList<>();
    Random ran = new Random();
    while (list.size() < 20) {
      int n = ran.nextInt(100);
      if (!list.contains(n)) {
        list.add(n);
        abb.insertar(n);
      }
    }
    System.out.println("preorden---");
    abb.preorden(abb.getRaiz());
    System.out.println("\npostorden---");
    abb.postorden(abb.getRaiz());
    System.out.println("\ninorden---");
    abb.inorden(abb.getRaiz());
    System.out.println("\nen niveles---");
    abb.enNiveles(abb.getRaiz());
    System.out.println("\n\n");
    System.out.println(list);

    // 5.
    abb = new ABB();
    List<Manzana> manzanas = new ArrayList<>();
    manzanas.add(new Manzana("Gala", "rojo", 400));
    manzanas.add(new Manzana("Golden", "amarillo", 370));
    manzanas.add(new Manzana("Granny Smith", "verde", 380));
    manzanas.add(new Manzana("Red Delicious", "rojo", 410));
    manzanas.add(new Manzana("Starking", "pintita", 390));
    manzanas.add(new Manzana("McIntosh", "rojo", 407));
    manzanas.add(new Manzana("Golden", "amarillo", 403));
    manzanas.add(new Manzana("Red Delicious", "rojo", 365));
    manzanas.add(new Manzana("Pink Lasy", "rosita", 385));
    manzanas.add(new Manzana("Granny Smith", "verde", 415));
    for (Manzana manzana : manzanas)
      abb.insertar(manzana);
    System.out.println("inorden---");
    abb.inorden(abb.getRaiz());
    System.out.println("\nen niveles---");
    abb.enNiveles(abb.getRaiz());
    System.out.println();

  }

  public boolean vacia() {
    return raiz == null;
  }

  public NodoArbol getRaiz() {
    return raiz;
  }

  public NodoArbol buscar(NodoArbol raiz, Comparable x) {
    // si me caigo del arbol o si encuentro x regresa raiz
    if (vacia() || x.compareTo(raiz.getInfo()) == 0)
      return raiz;
    if (x.compareTo(raiz.getInfo()) < 0)
      return buscar(raiz.getHijoIzq(), x);
    if (x.compareTo(raiz.getInfo()) > 0)
      return buscar(raiz.getHijoDer(), x);
  };

  public void insertar(Comparable x) {
    raiz = insertaNodo(raiz, x);
  };

  private NodoArbol insertaNodo(NodoArbol actual, Comparable x) {
    // no pueden repetirse los elementos del arbol
    if (actual == null)
      return new NodoArbol(x);
    if (x.compareTo(actual.getInfo()) < 0)
      actual.setHijoIzq(insertaNodo(actual.getHijoIzq(), x));
    if (x.compareTo(actual.getInfo()) > 0)
      actual.setHijoDer(insertaNodo(actual.getHijoDer(), x));
    return actual;
  }

  public NodoArbol borrar(NodoArbol actual, Comparable x) {
    if (actual == null)
      return null;
    if (x.compareTo(actual.getInfo()) < 0)
      actual.setHijoIzq(borrar(actual.getHijoIzq(), x));
    if (x.compareTo(actual.getInfo()) > 0)
      actual.setHijoDer(borrar(actual.getHijoDer(), x));
    if (x.equals(actual.getInfo())) {
      // nodo sin hijos
      if (actual.getHijoIzq() == null && actual.getHijoDer() == null)
        return null;
      // nodo con solo un hijo
      if (actual.getHijoIzq() == null)
        return actual.getHijoDer();
      else if (actual.getHijoDer() == null)
        return actual.getHijoIzq();
      // nodo con dos hijos
      Comparable m = minMay(actual.getHijoDer());
      actual.setInfo(m);
      actual.setHijoDer(borrar(actual.getHijoDer(), m));
    }
    return actual;

  };

  private Comparable minMay(NodoArbol actual) {
    if (actual.getHijoIzq() == null)
      return actual.getInfo();
    return minMay(actual.getHijoIzq());
  }

  public void preorden(NodoArbol actual) {
    if (actual != null) {
      System.out.print(actual.getInfo() + " ");
      preorden(actual.getHijoIzq());
      preorden(actual.getHijoDer());
    }
  };

  public void inorden(NodoArbol actual) {
    if (actual != null) {
      inorden(actual.getHijoIzq());
      System.out.print(actual.getInfo() + " ");
      inorden(actual.getHijoDer());
    }
  };

  public void postorden(NodoArbol actual) {
    if (actual != null) {
      postorden(actual.getHijoIzq());
      postorden(actual.getHijoDer());
      System.out.print(actual.getInfo() + " ");
    }
  };

  public void enNiveles(NodoArbol actual) {
    Fila f = new Fila();
    if (!vacia()) {
      f.enqueue(actual);
      do {
        NodoArbol aux = (NodoArbol) f.valorFrente();
        f.dequeue();
        System.out.print(aux.getInfo() + " ");
        if (aux.getHijoIzq() != null)
          f.enqueue(aux.getHijoIzq());
        if (aux.getHijoDer() != null)
          f.enqueue(aux.getHijoDer());
      } while (!f.vacia());
    }
  };
}
