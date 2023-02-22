package com.dsa.app;

import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {

  int[] info;

  public Arreglos() {
    System.out.println("Tamanio: ");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    info = new int[n];

    for (int i = 0; i < info.length; i++) {
      System.out.println("Escribe numero: ");
      info[i] = s.nextInt();
    }
    s.close();
  }

  public Arreglos(int n) {
    Scanner s = new Scanner(System.in);
    info = new int[n];
    for (int i = 0; i < info.length; i++) {
      System.out.println("Escribe numero: ");
      info[i] = s.nextInt();
    }
    s.close();
  }

  public Arreglos(int[] n){
    this.info =  n;
  }

  public int medio() {
    return this.info[this.info.length / 2];
  }

  public int suma() {
    int sum = 0;
    for (int n : this.info) {
      sum += n;
    }
    return sum;
  }

  public float prom() {
    return suma() / this.info.length;
  }

  public int max() {
    int max = 0;
    for (int n : info) {
      if (n > max)
        max = n;
    }
    return max;
  }

  public int maxIndex() {
    int maxIndex = 0;
    for (int n = 1; n < info.length; n++) {
      if (this.info[n] > this.info[maxIndex])
        maxIndex = n;
    }
    return maxIndex;
  }

  @Override
  public String toString() {
    String res = new String("[");
    for (int i = 0; i < info.length; i++) {
      res = res.concat(String.valueOf(this.info[i]));
      res = res.concat(" ");
    }
    res = res.concat("]");
    return res;
  }

  public void print() {
    for (int n : this.info) {
      System.out.println(n);
    }
  }

}
