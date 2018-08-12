package com.pedro.arrays;

public class EjemploArrayBidimensional2 {
    public static void main(String[] args) {
        int[][] numeros = {
                {1, 2, 4},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] dimension1 : numeros) {
            for (int dimension2 : dimension1) {
                System.out.println(dimension2);
            }

        }
    }
}
