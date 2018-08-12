package com.pedro.entradas;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        double num = entrada.nextDouble();
        System.out.println("La raiz de " + num + " es " + Math.sqrt(num));
    }
}
