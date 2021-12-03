package com.company;

import java.util.Arrays;

public class paresImpares {
    public static void main(String[] args) {
        int numPares = 0, numImpares = 0;
        int[] numeros = new int[10];
        Utilidades.rellenaArray(numeros, 0, 20);
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0)
                numPares++;
            else numImpares++;
        }
        System.out.println("El numero de pares es: "+ numPares);
        System.out.println("El numero de impares es:" + numImpares);
    }
}
