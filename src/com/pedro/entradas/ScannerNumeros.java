package com.pedro.entradas;

import java.util.Scanner;

public class ScannerNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce 1º número: ");
        int num1 = entrada.nextInt();

        System.out.println("Introduce 2º número: ");
        int num2 = entrada.nextInt();

        System.out.println("La suma es " + (num1 + num2));

        entrada.close();
    }
}
