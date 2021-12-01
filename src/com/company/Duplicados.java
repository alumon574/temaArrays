package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicados {
    public static void main(String[] args) {
        //dejo el scanner porque he puesto el tamaño del array hardcoded, pero se puede modificar en cualquier momento
        Scanner reader = new Scanner(System.in);
        int[] listaNums = new int[10];
        String numsIguales = "";
        Utilidades.rellenaArray(listaNums, 0, 10);
        System.out.println(Arrays.toString(listaNums));
        for (int i = 0; i < listaNums.length; i++) {
            for (int j = i + 1; j < listaNums.length; j++) {
                if (listaNums[i] == listaNums[j]) {
                    numsIguales = numsIguales + "|" + listaNums[j];
                    System.out.println(numsIguales + "|");
                }
            }
        }
    }
}
