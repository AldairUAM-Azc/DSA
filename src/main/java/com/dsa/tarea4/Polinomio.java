package com.dsa.tarea4;

import com.dsa.listas.ListaLigada;
import com.dsa.nodos.Nodo;

public class Polinomio extends ListaLigada {

  public Polinomio() {
    super();
  }

  public Polinomio sumar(Polinomio p) {
    Polinomio suma = new Polinomio();
    Nodo aux1 = cabeza, aux2 = p.getCabeza();
    while (aux1 != null && aux2 != null) { // termina hasta que hallas recorrido la totalidad de un Polinomio
      Termino term1 = (Termino) aux1.getInfo();
      Termino term2 = (Termino) aux2.getInfo();
      //Compara los terminos guardados en aux1 y aux2, luego inserta en la Lista suma el Termino con el exponente mas grande.
      //Luego avanza la liga de la Lista correspondiente
      if (term1.compareTo(term2) > 0) {
        suma.insertar(term2);
        aux2 = aux2.getLiga();
      } else if (term1.compareTo(term2) < 0) {
        suma.insertar(term1);
        aux1 = aux1.getLiga();
      } else { //si ambos terminos tienen el mismo exponente entonces inserta en suma un Termino que contenga la suma de los coeficientes de los terminos
        suma.insertar(new Termino(
            term1.getCoeficiente() + term2.getCoeficiente(),
            term1.getExponente()));
        aux1 = aux1.getLiga();
        aux2 = aux2.getLiga();
      }
    }
    //inserta los Terminos faltantes de alguno de los Polinomios this y p en el Polinomio suma
    while (aux1 != null) { 
      suma.insertar((Termino) aux1.getInfo());
      aux1 = aux1.getLiga();
    }
    while (aux2 != null) { 
      suma.insertar((Termino) aux2.getInfo());
      aux2 = aux2.getLiga();
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

    System.out.println("p1= " + p1);
    System.out.println("p2= " + p2);
    System.out.println("p3= " + p3);
    System.out.println("p4= " + p4);
    System.out.println("p5= " + p5);

    System.out.println("p1= " + p1);
    System.out.println("p2= " + p2);
    Polinomio p6 = p1.sumar(p2);
    System.out.println("Suma");
    System.out.println(p6);
  }
}
