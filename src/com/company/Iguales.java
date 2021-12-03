package com.company;

import java.util.Arrays;

public class Iguales {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        Utilidades.rellenaArray(array1, 0, 10);
        int[] array2 = array1.clone();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                System.out.println("El indice " + i + " es igual al del segundo array");
            }
            if (array1[i] != array2[i]) {
                System.out.println("El indice " + i + " es diferente al del segundo array");
            }
        }
    }
}
