package com.dsa.tarea1;

import java.util.Hashtable;

public class Tarea1 {
  public static void main(String[] args) {
    // int[] nums = new int[]{5,3,7, 12, 1};
    // System.out.println(Arrays.toString(nums));
    // sort(nums);
    // System.out.println("SORTED");
    // System.out.println(Arrays.toString(nums));
    // System.out.println(circleArea(1));
    // System.out.println(circleVolume( 1));
    // printPowers(125);
    // System.out.println(hypothenuse(3,4));
    // buildLadder(5);
    int[] nums = new int[] { 12, 27, 17, 17, 20 };
    System.out.println(estadisticos(nums).toString());
  }

  // 1. Función que regresa la suma de dos enteros dados
  public static int suma(int a, int b) {
    return a + b;
  }
  public static int mode(int[] nums){
    return 1;
  }

  // 2.Calcular la media, mediana y moda de 5 números.
  public static int[] estadisticos(int[] nums) {
    int[] estadisticos = new int[3];
    sort(estadisticos);

    int sum = 0;
    for (int n : nums) {
      sum += n;
    }

    Hashtable<Integer, Integer> counter = new Hashtable<>();
    int mode = nums[0];
    for (int n : nums) {

      if (counter.get(n) == null) {
        counter.put(n, 1);
      } else {
        counter.put(n, counter.get(n) + 1);
      }
      if (counter.get(n) > counter.get(mode)) {
        mode = n;
      }
    }

    estadisticos[0] = sum / nums.length; // media
    estadisticos[1] = nums[nums.length / 2]; // median giving the nums array is sorted
    estadisticos[2] = mode; // mode
    return estadisticos;
  }

  // 3. Calcula el area de un circulo dado el radio
  public static float circleArea(float radius) {
    return (float) (Math.PI * Math.pow(radius, 2));
  }

  // 4. Calcular el volumen de una esfera dado su radio.
  public static float circleVolume(float radius) {
    return (float) (4.0 / 3.0 * Math.PI * Math.pow(radius, 3));
  }

  // 5. Imprimir las potencias de 2 menores a iguales a 2n
  public static void printPowers(int num) {
    if (num < 1)
      return;

    int limit = 2 * num;
    int i = 0;
    while (Math.pow(2, i) <= limit) {
      System.out.println((int) (Math.pow(2, i)));
      i++;
    }
  }

  // 6. Calcular la longitud de la hipotenusa según el teorema de Pitágoras, dada
  // la longitud de los catetos de un triangulo rectangulo
  public static float hypothenuse(int a, int b) {
    return (float) (Math.pow(a * a + b * b, 0.5));
  }

  // 7. Regresar verdadero si n corresponde a un año bisiesto, y falso en otro
  // caso. Asumir que n > 1582,correspondiente a un año en el calendario
  // Gregoriano
  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
  }

  // 8. Escribir funciones que permitan crear las siguientes figuras.
  public static void buildLadder(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 1; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // UTILS
  private static void sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i + 1] < array[i]) {
          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
        }
      }
    }
  }
}