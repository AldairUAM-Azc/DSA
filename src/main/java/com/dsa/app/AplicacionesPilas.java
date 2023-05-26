package com.dsa.app;

import com.dsa.pilas.PilaDinamica;

public class AplicacionesPilas {
  public static void main(String[] args) {
    System.out.println(cambioBase(1073, 5)); // 13243
    System.out.println(reverse("ILL BE BACK")); // KCAB EB LLI
  }

  public static String cambioBase(int n, int b) {
    PilaDinamica<Integer> p = new PilaDinamica<Integer>();
    if (n == 0)
      p.push(0);
    while (n > 0) {
      p.push(n % b);
      n /= b;
    }
    System.out.println(p);
    String cambioBase = "";
    while (!p.vacia()) {
      cambioBase += p.pop();
    }
    return cambioBase;
  }

  public static String reverse(String str) {
    // PilaEstatica p = new PilaEstatica(str.length());
    PilaDinamica<Character> p = new PilaDinamica<Character>();
    for (char c : str.toCharArray())
      p.push(c);
    System.out.println(p);
    String reversed = "";
    while (!p.vacia())
      reversed += p.pop();
    return reversed;
  }
}