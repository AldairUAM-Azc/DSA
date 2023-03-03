package com.dsa.tarea2;

import java.util.Arrays;

public class Tarea2 {
  public static void main(String[] args) {
    String[] words = { "Armonia", "Brillo", "Maiz", "Marfil", "Zapateria",
        "Gatito", "Elixir", "Yucatan", "Celular", "Chipotle" };

    System.out.println("Antes de ordenar:");
    System.out.println(Arrays.toString(words));
    System.out.println("Despues de ordenar:");
    // Tarea2.stringSelectionSort(words);
    System.out.println(Arrays.toString(words));
  }

}

// String[] words = {"Harmony", "Glimmer", "Bamboo","Ivory", "Juggler",
// "Kitten", "Elixir", "Flamingo", "Chirp", "Doorknob"};

// int[] numbers = new int[30];
// Random rand = new Random();
// for (int i = 0; i < numbers.length; i++) {
// numbers[i] = rand.nextInt(100) + 1;
// }

// public static void stringSelectionSort(String[] strings) {
// for (int i = 0; i < strings.length; i++) {
// int minIndex = i;
// for (int j = i + 1; j < strings.length; j++) {
// if (strings[j].compareToIgnoreCase(strings[minIndex]) < 0) {
// minIndex = j;
// }
// }
// String temp = strings[i];
// strings[i] = strings[minIndex];
// strings[minIndex] = temp;
// }
// }
// public static void selectionSort(int[] nums) {
//   for (int i = 0; i < nums.length; i++) {
//     int minIndex = i;
//     for (int j = i + 1; j < nums.length; j++) {
//       if (nums[j] < nums[minIndex]) {
//         minIndex = j;
//       }
//     }
//     int temp = nums[i];
//     nums[i] = nums[minIndex];
//     nums[minIndex] = temp;
//   }
// }
// public static boolean areSorted(int[] nums) {
// for (int i = 1; i < nums.length; i++) {
// if (nums[i] < nums[i - 1])
// return false;
// }
// return true;
// }
// }
