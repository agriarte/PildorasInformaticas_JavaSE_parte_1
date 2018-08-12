package com.pedro;

public class AsciiRandom {
    public static void main(String[] args) {
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
        }
    }

