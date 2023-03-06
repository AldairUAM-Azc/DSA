package com.dsa.app;

import com.dsa.pilas.PilaEstatica;

public class CambioBase {
  public static void main(String[] args) {
    System.out.println(cambioBase(1073, 5));
  }

  public static String cambioBase(int n, int b) {
    int length = n > 0 ? (int) (Math.log10(n) + 1) : 1;
    PilaEstatica p = new PilaEstatica(length); //initialize using length = number of digits of n
    if (n == 0)
      p.push(0);

    while (n > 0) {
      p.push(n % b);
      n /= b;
    }
    String nuevaCadena = "";
    while (!p.vacia()) {
      nuevaCadena += p.pop();
    }
    return nuevaCadena;
  }
}