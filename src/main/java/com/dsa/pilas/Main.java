package com.dsa.pilas;

public class Main {
  public static void main(String[] args) {
    //Pruebas PilaEstatica
    PilaEstatica mypila = new PilaEstatica(3);
    for (int i = 0; i < 3; i++) {
     mypila.push(Integer.valueOf(i));
    }
    System.out.println(mypila);
    mypila.push(Integer.valueOf(3));
    System.out.println("");

    //Pruebas PilaDinamica
    PilaDinamica miDinamica = new PilaDinamica();
    miDinamica.push("Camara camara camara vavavavava");
    miDinamica.push("1");
    miDinamica.push("2");
    System.out.println(miDinamica);
    miDinamica.push("Camara camara camara vavavavava");
    miDinamica.push("1");
    miDinamica.push("2");
    System.out.println(miDinamica);
    miDinamica.pop();
    System.out.println(miDinamica);
    miDinamica.pop();
    System.out.println(miDinamica);
    miDinamica.pop();
    System.out.println(miDinamica);
    miDinamica.pop();
    System.out.println(miDinamica);
    miDinamica.pop();
    System.out.println(miDinamica);
    miDinamica.pop();
    System.out.println(miDinamica);
  }
}
