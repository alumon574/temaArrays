package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class sumaIgual {
    public static void main(String[] args) {
        int numeroObjetivo;
        Scanner reader = new Scanner(System.in);
        int[] listaNums = new int[10];
        System.out.println("Cual es el numero objetivo");
        numeroObjetivo = reader.nextInt();
        Utilidades.rellenaArray(listaNums, 0, 20);
        System.out.println(Arrays.toString(listaNums));
        for (int i = 0; i < listaNums.length; i++) {
            for (int j = 0; j < listaNums.length; j++) {
                if (listaNums[i] + listaNums[j] == numeroObjetivo)
                    System.out.println("Los pares " + listaNums[i] + " y " + listaNums[j] + " sirven");
            }
        }
    }
}
