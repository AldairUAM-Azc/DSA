package com.dsa.recursivo;

import com.dsa.listas.ListaLigada;
import com.dsa.nodos.Nodo;

public class Recursivo {
  public static int sumaArreglo(int[] a, int n){
    if(n <= 0)
      return 0;
    return sumaArreglo(a, n-1) + a[n-1];
  }

  public static void stairStar(int n){
    String str = "";
    if (n > 1) 
      stairStar(n - 1);
    for (int i = 1; i <= n; i++)
      str += "*";
    str += "\n";
    System.out.println(str);
  }

  public static ListaLigada intercalar(ListaLigada l1, ListaLigada l2){
    Nodo aux1 = l1.getCabeza(), aux2 = l2.getCabeza();
    
    boolean toggle = true;
    ListaLigada intercalada = new ListaLigada();
    while(aux1 != null || aux2 != null){
      if(toggle){
        intercalada.insertar(aux1.getInfo());
        aux1 = aux1.getLiga();
        toggle = false;
      } else {
        intercalada.insertar(aux2.getInfo());
        aux2 = aux2.getLiga();
        toggle = true;
      }
    }
    while(aux1 != null){
      intercalada.insertar(aux1.getInfo());
      aux1 = aux1.getLiga();
    }
    while(aux2 != null){
      intercalada.insertar(aux2.getInfo());
      aux2 = aux2.getLiga();
    }
    return intercalada;    
  }

  public static void main(String[] args){
    // int [] a = {1,2,3,4,5,6,7,8,9};
    // System.out.println(sumaArreglo(a, a.length));
    // stairStar(5);
    ListaLigada l1 = new ListaLigada();
    l1.insertar(4);
    l1.insertar(10);
    l1.insertar(3);
    l1.insertar(1);
    System.out.println(l1);
    ListaLigada l2 = new ListaLigada();
    l2.insertar(7);
    l2.insertar(8);
    l2.insertar(2);
    System.out.println(l2);

    System.out.println(intercalar(l1, l2));
  }
}
