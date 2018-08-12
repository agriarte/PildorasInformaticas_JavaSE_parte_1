package com.pedro.flujo;

import javax.swing.*;

public class If3 {
    public static void main(String[] args) {
        int distancia;
        double renta;

        distancia = Integer.parseInt(JOptionPane.showInputDialog("Introduce distancia al colegio"));

        renta = Double.parseDouble(JOptionPane.showInputDialog("Introduce renta familiar"));

        if (distancia > 10  && renta < 20000) {
            System.out.println("Condiciones cumplidas");
        } else {
            System.out.println("no se cumplen las condiciones");
        }


    }
}
