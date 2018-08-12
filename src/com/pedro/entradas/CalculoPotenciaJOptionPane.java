package com.pedro.entradas;

import javax.swing.*;

public class CalculoPotenciaJOptionPane {
    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog("introduce base"));

        int exponente = Integer.parseInt(JOptionPane.showInputDialog("introduce exponente"));

        System.out.println( base + " elevado a " + exponente + " es igual a " + Math.pow(base,exponente)) ;

    }
}
