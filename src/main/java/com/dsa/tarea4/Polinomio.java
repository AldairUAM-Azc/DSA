package com.dsa.tarea4;

import com.dsa.listas.ListaEnlazada;
import com.dsa.nodos.Nodo;

public class Polinomio extends ListaEnlazada {

  public Polinomio() {
    super();
  }

  public Polinomio sumar(Polinomio p) {
    Polinomio suma = new Polinomio();
    Nodo longest, shortest;
    if (this.longitud() > p.longitud()) {
      longest = this.getCabeza();
      shortest = p.getCabeza();
    } else {
      longest = p.getCabeza();
      shortest = this.getCabeza();
    }
    while (shortest != null) {
      Termino termLong = (Termino) longest.getInfo();
      Termino termShort = (Termino) shortest.getInfo();
      if (termLong.compareTo(termShort) > 0) {
        suma.insertar(new Termino(
            termShort.getCoeficiente(),
            termShort.getExponente()));
        shortest = shortest.getLiga();
      } else if (termLong.compareTo(termShort) < 0) {
        suma.insertar(new Termino(
            termLong.getCoeficiente(),
            termLong.getExponente()));
        longest = longest.getLiga();
      } else {
        suma.insertar(new Termino(
            termLong.getCoeficiente() + termShort.getCoeficiente(),
            termLong.getExponente()));
        shortest = shortest.getLiga();
        longest = longest.getLiga();
      }
    }
    // once there arent any term in shortest polynomial left, then copy all remaining terms of longest polynomial to suma
    while (longest != null) { 
      suma.insertar((Termino) longest.getInfo());
      longest.getLiga();
    }
    return suma;
  }

  public static void main(String[] args) {
    Polinomio p1 = new Polinomio();
    Termino p1Quad = new Termino(1, 4);
    Termino p1Cub = new Termino(1, 3);
    Termino p1Cuad = new Termino(1, 2);
    Termino p1Const = new Termino(1, 0);
    p1.insertar(p1Quad);
    p1.insertar(p1Cub);
    p1.insertar(p1Const);
    p1.insertar(p1Cuad);

    Polinomio p2 = new Polinomio();
    Termino p2Cub = new Termino(-1, 4);
    Termino p2Const = new Termino(1, 0);
    p2.insertar(p2Cub);
    p2.insertar(p2Const);

    Polinomio p3 = new Polinomio();
    Termino p3Cuad = new Termino(1, 2);
    Termino p3Lin = new Termino(-4, 1);
    Termino p3Const = new Termino(4, 0);
    p3.insertar(p3Lin);
    p3.insertar(p3Const);
    p3.insertar(p3Cuad);

    Polinomio p4 = new Polinomio();
    Termino p4Cub = new Termino(-6, 3);
    Termino p4Cuad = new Termino(-2, 2);
    Termino p4Lin = new Termino(0, 1);
    Termino p4Const = new Termino(-1, 0);
    p4.insertar(p4Cub);
    p4.insertar(p4Lin);
    p4.insertar(p4Const);
    p4.insertar(p4Cuad);

    Polinomio p5 = new Polinomio();
    Termino p5Cub = new Termino(2, 3);
    Termino p5Cuad = new Termino(0, 2);
    Termino p5Lin = new Termino(2, 1);
    Termino p5Const = new Termino(-9, 0);
    p5.insertar(p5Cub);
    p5.insertar(p5Lin);
    p5.insertar(p5Const);
    p5.insertar(p5Cuad);

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
    System.out.println(p5);
    
    Polinomio p6 = p1.sumar(p2);
    System.out.println("Suma");
    System.out.println(p6);
  }
}
