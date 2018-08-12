package com.pedro;

public class CalculoPotencia {
    public static void main(String[] args) {
        int base,exponente;
        base = 5;
        exponente = 12;
        long resultado = (long) Math.pow(base,exponente);
        System.out.println(base + " elevado a " + exponente + " es igual a " +  resultado);
    }
}
