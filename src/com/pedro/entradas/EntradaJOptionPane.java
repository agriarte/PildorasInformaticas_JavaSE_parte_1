package com.pedro.entradas;

import javax.swing.*;

public class EntradaJOptionPane {
    public static void main(String[] args) {
        String nombre=JOptionPane.showInputDialog("Introduce tu nombre");

        int edad= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");
    }
}
