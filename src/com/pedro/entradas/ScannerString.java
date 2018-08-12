package com.pedro.entradas;

import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe tu nombre");
        String txt = entrada.nextLine();
        System.out.println("Tu nombre es " + txt);
    }
}
