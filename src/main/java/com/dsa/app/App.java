/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.dsa.app;

public class App {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5};
        Arreglos arr1 = new Arreglos(nums);

        // Arreglos arreglos = new Arreglos();
        System.out.println("This is your array: ");
        // arreglos.print();
        System.out.println(arr1.toString());
        // System.out.println(arr1.suma());
        // System.out.println(arreglos.medio());
        // System.out.println(arreglos.prom());
        // System.out.println(arreglos.max());
        // System.out.println(arreglos.maxIndex());
    }

}