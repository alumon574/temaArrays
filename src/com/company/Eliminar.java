package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Eliminar {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //El array lo hago de tamaño 10 por no ir cambiandolo cada vez
        int[] listaNums = new int[10];
        int indice;
        System.out.println("que indice quieres mandar al final?");
        do {
            indice = reader.nextInt();
        } while (indice < 0 || indice > 9);
        Utilidades.rellenaArray(listaNums, 0, 10);
        System.out.println("el array original es este:");
        System.out.println(Arrays.toString(listaNums));
        int indiceOriginal = listaNums[indice];
        System.out.println("El nuevo array es este:");
        for (int i = indice; i < listaNums.length - 1; i++)
            listaNums[i] = listaNums[i + 1];
        listaNums[listaNums.length - 1] = indiceOriginal;
        System.out.println(Arrays.toString(listaNums));
    }
}
