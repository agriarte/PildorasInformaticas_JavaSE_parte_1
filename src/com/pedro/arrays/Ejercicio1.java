package com.pedro.arrays;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        System.out.println("Introduce 10 números:");

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("num " + i + " : ");

            numeros[i] = entrada.nextInt();
        }

        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) positivos++;
            else if (numeros[i] < 0) negativos++;
            else ceros++;
        }
        System.out.println("Positivos " + positivos);
        System.out.println("Negativos " + negativos);
        System.out.println("Ceros " + ceros);
    }
}
