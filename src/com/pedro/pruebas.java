package com.pedro;

public class pruebas {
    public static void main(String[] args) {
        String nombre;
        nombre = "Angel";
        char segunda_posicion = nombre.charAt(0);


        //generador de numero 0-9 aleatorias
        for (int i = 0; i <= 100; i++) {
            int n = (int) (Math.random() * 10 + 48);
            String str = Character.toString((char) n);
            System.out.println(str);
        }
        //generador de letras A-Z aleatorias
        for (int i = 0; i <= 100; i++) {
            int n = (int) (Math.random() * 26 + 65);
            String str = Character.toString((char) n);
            System.out.println(str);
        }

        //generador de numero 0-9 aleatorias
        for (int i = 0; i <= 100; i++) {
            int n = (int) (Math.random() * 10 + 48);
            String str = Character.toString((char) n);
            System.out.println(str);
        }

    }
}
