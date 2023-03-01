package com.dsa.tarea2;

import java.util.Arrays;
import java.util.Random;

public class Tarea2 {
  public static void main(String[] args) {
    int[] numbers = { -4, 8, -6, 2, -5 };
    // String[] words = {"Harmony", "Glimmer", "Bamboo","Ivory", "Juggler", "Kitten", "Elixir", "Flamingo", "Chirp", "Doorknob"};

    // int[] numbers = new int[30];
    // Random rand = new Random();
    // for (int i = 0; i < numbers.length; i++) {
    //   numbers[i] = rand.nextInt(100) + 1;
    // }

    Arreglos myarreglo = new Arreglos();
    System.out.println(myarreglo);
    System.out.println("El arreglo tiene:");
    System.out.println(myarreglo.cuentaPositivos() + " numeros positivos");
    System.out.println(myarreglo.cuentaNegativos() + " numeros negativos");
    System.out.println(myarreglo.cuentaPares() + " numeros pares");
    System.out.println(myarreglo.cuentaImpares() + " numeros impares");
    System.out.println(myarreglo.cuentaParesPositivos() + " numeros pares positivos");
  }

  public static void selectionSort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < nums[minIndex]) {
          minIndex = j;
        }
      }
      int temp = nums[i];
      nums[i] = nums[minIndex];
      nums[minIndex] = temp;
    }
  }

  public static void stringSelectionSort(String[] strings){
    for (int i = 0; i < strings.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < strings.length; j++) {
        if (strings[j].compareToIgnoreCase(strings[minIndex]) < 0) {
          minIndex = j;
        }
      }
      String temp = strings[i];
      strings[i] = strings[minIndex];
      strings[minIndex] = temp;
    }
  }

  public static boolean areSorted(int[] nums){
    for (int i = 1; i < nums.length; i++) {
      if(nums[i]<nums[i-1])
        return false;
    }
    return true;
  }
}
