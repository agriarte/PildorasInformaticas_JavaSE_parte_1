package com.pedro.flujo;

public class For1 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i+=2) {
            System.out.println("i: " + i);

            if (i==6) break; // rompe el bucle y sale fuera si cumple condición
        }
    }
}
