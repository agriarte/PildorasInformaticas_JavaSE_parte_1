package com.pedro.flujo;

import javax.swing.*;

public class if4_ejercicio {
    public static void main(String[] args) {
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Estatura: "));
        String genero = JOptionPane.showInputDialog("Hombre o mujer");

        if (genero.equalsIgnoreCase("hombre")){

            JOptionPane.showMessageDialog(null, "Peso ideal hombre para estatura de " + altura + " es " + (altura-110));

        } else {

            JOptionPane.showMessageDialog(null, "Peso ideal mujer para estatura de " + altura + " es " + (altura-120));

        }

    }




}
