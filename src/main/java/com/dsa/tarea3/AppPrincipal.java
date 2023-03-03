package com.dsa.tarea3;

import java.util.Scanner;

public class AppPrincipal {
  public static void main(String[] args) {
    System.out.println("Ingresa los complejo que quieres operar:");
    Complejo c1 = new Complejo();
    System.out.println("Complejo 1:\n" + c1 + "\n");
    Complejo c2 = new Complejo();
    System.out.println("Complejo 2:\n" + c2 + "\n");

    loop: while (true) {
      System.out.println(
          "\nMENU\n"
              + "(1) Suma\n"
              + "(2) Resta\n"
              + "(3) Multiplicacion\n"
              + "(4) Division\n"
              + "(5) Salir\n"
              + "Presiona la opcion correspondiente: ");

      Scanner s = new Scanner(System.in);
      int option = Integer.parseInt(s.nextLine().trim());

      switch (option) {
        case 1:
          System.out.println("\n" + c1 + " + " + c2 + " = " + c1.suma(c2));
          break;
        case 2:
          System.out.println("\n" + c1 + " - " + c2 + " = " + c1.resta(c2));
          break;
        case 3:
          System.out.println("\n" + c1 + " * " + c2 + " = " + c1.multiplica(c2));
          break;
        case 4:
          System.out.println("\n" + c1 + " / " + c2 + " = " + c1.divide(c2));
          break;
        case 5:
          System.out.println("Nos vemos luego");
          break loop;
        default:
          System.out.println("Lo sientom, esa opcion no esta disponible");
          break;
      }
    }
  }
}
