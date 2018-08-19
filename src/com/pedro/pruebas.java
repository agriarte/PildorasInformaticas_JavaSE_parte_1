package com.pedro;

public class pruebas {
    public static void main(String[] args) {
        String nombre;
        nombre = "Angel";
        char segunda_posicion = nombre.charAt(0);


        //generador de numero 0-9 aleatorias
        for (int i = 0; i <= 100; i++) {
            int n = (int) (Math.random() * 2);

            System.out.println(n);
        }


    }
}
