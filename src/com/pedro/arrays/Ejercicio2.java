package com.pedro.arrays;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int suma_pares = 0;
        int cont_pares = 0;
        System.out.println("Introduce 10 números:");

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("num " + i + " : ");

            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < numeros.length ; i++) {
            if (i%2==0) {
                suma_pares=suma_pares + numeros[i];
                cont_pares++;
            }
        }

        System.out.println("La media de indice par es " + (double) (suma_pares/cont_pares));
        System.out.println(suma_pares);
        System.out.println(cont_pares);
    }
}

