package com.dsa.tarea5;

import java.util.Arrays;

public class Recursivo {
  public static void main(String[] args) {
    System.out.println("---Factorial---");
    System.out.println("Factorial de 5: " + factorial(5));
    System.out.println("Factorial de 9: " + factorial(9));
    System.out.println("Factorial de 10: " + factorial(10));

    System.out.println("---Fibonacci---");
    System.out.println("Fibonacci 5o termino: " + fibonacci(5));
    System.out.println("Fibonacci 9o termino: " + fibonacci(9));
    System.out.println("Fibonacci 2o termino: " + fibonacci(2));

    System.out.println("---Potencia---");
    System.out.println("Potencia 3^3 : " + potencia(3, 3));
    System.out.println("Potencia 2^8: " + potencia(2, 8));
    System.out.println("Potencia 15^2: " + potencia(15, 2));

    System.out.println("---MCD---");
    System.out.println("MCD entre 100 y 20: " + MCD(100, 20));
    System.out.println("MCD entre 16 y 7: " + MCD(16, 7));
    System.out.println("MCD entre 21 y 35:" + MCD(21, 35));

    System.out.println("---Busqueda Binaria---");
    int[] a = { 2, 4, 5, 7, 11, 15 };
    System.out.println(Arrays.toString(a));
    System.out.println("Busca 5: " + binSearch(a, 5, 0, a.length - 1));
    System.out.println("Busca 10: " + binSearch(a, 10, 0, a.length - 1));
    System.out.println("Busca 16: " + binSearch(a, 16, 0, a.length - 1));

    System.out.println("---Merge Sort---");
    int[] b = { 15, 4, 11, 7, 1, 18 };
    System.out.println("Array desordenado");
    System.out.println(Arrays.toString(b));
    mergeSort(b, b.length - 1);
    System.out.println("Array ordenado");
    System.out.println(Arrays.toString(b));
  }

  public static int factorial(int n) {
    if (n < 2)
      return 1;
    return n * factorial(n - 1);
  }

  public static int fibonacci(int n) {
    if (n < 3)
      return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static int potencia(int b, int e) {
    if (e < 2)
      return b;
    return b * potencia(b, e - 1);
  }

  public static int MCD(int a, int b) {
    if (b == 0)
      return a;
    return MCD(b, a % b);
  }

  public static int binSearch(int[] arr, int x, int izq, int der) {
    if (izq > der)
      return -1;
    int med = (izq + der) / 2;
    if (arr[med] == x)
      return med;
    else if (arr[med] > x)
      return binSearch(arr, x, izq, med - 1);
    else
      return binSearch(arr, x, med + 1, der);
  }

  public static void mergeSort(int[] a, int n) {
    if (n < 2) {
      return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];
    // crea copia de los elementos de la parte izq en l
    for (int i = 0; i < mid; i++)
      l[i] = a[i];
    // crea copia de los elementos de la parte derecha en r
    for (int i = mid; i < n; i++)
      r[i - mid] = a[i];
    mergeSort(l, mid);
    mergeSort(r, n - mid);
    merge(a, l, r, mid, n - mid);
  }

  public static void merge(int[] a, int[] l, int[] r, int endL, int endR) {
    int i = 0, j = 0, k = 0;
    while (i < endL && j < endR) {
      if (l[i] <= r[j])
        a[k] = l[i++];
      else
        a[k] = r[j++];
      k++;
    }
    while (i < endL)
      a[k++] = l[i++];
    while (j < endR)
      a[k++] = r[j++];
  }
}
