package com.company;

import java.util.Arrays;

public class moverCeros {
    public static void eliminar0(int[] numeros) {
        int numCeros = 0, contador=1;
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] == 0) {
                numCeros++;
                if (numeros[i + 1] != 0)
                    numeros[i] = numeros[i + 1];
            }
        }
        for (int j = numeros.length-contador; j > numCeros; j--) {
            numeros[j] = 0;
            contador++;
        }
    }

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Utilidades.rellenaArray(numeros, 0, 2);
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length - 1; i++)
            if (numeros[i] == 0)
                eliminar0(numeros);
        System.out.println(Arrays.toString(numeros));
    }
}
