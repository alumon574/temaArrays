package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Comunes {
    public static void main(String[] args) {
        //dejo el scanner porque he puesto el tamaño del array hardcoded, pero se puede modificar en cualquier momento
        Scanner reader = new Scanner(System.in);
        String numsIguales="";
        int[] listaNums1 = new int[10];
        int[] listaNums2 = new int[10];
        Utilidades.rellenaArray(listaNums1, 0, 20);
        System.out.println(Arrays.toString(listaNums1));
        Utilidades.rellenaArray(listaNums2, 0, 20);
        System.out.println(Arrays.toString(listaNums2));
        for (int i = 0; i < listaNums1.length; i++) {
            for (int j=0;j< listaNums2.length;j++){
                if (listaNums1[i]==listaNums2[j]){
                    System.out.println("Se repite:"+ listaNums1[i]);
                }

            }
        }
    }

}
