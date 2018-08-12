package com.pedro.arrays;

public class EjemploArray1 {
    public static void main(String[] args) {

        // forma 1
        int[] valores = new int[5];

        valores[0] = 12;
        valores[1] = 4;
        valores[2] = 55;
        valores[3] = 34;
        valores[4] = 25;

        //forma 2
        int[] valores2 = {12, 4, 55, 34, 25};

        System.out.println(valores[1]);
        System.out.println(valores2[1]);


        String[] nombre_personas = {"Juan", "Pedro", "Miguel"};


        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        for (int num : valores2) {
            System.out.println(num);
        }

        for (String nombres : nombre_personas) {
            System.out.println(nombres);
        }
    }
}
