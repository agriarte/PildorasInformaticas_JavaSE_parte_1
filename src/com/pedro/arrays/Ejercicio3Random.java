package com.pedro.arrays;

public class Ejercicio3Random {
    public static void main(String[] args) {
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100);

        }
        for (int valor : num) {
            System.out.println(valor);
        }
    }
}
