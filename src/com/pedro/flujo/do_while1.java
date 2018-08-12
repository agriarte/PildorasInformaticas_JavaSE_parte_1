package com.pedro.flujo;

import javax.swing.*;

public class do_while1 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Este programa cuenta los caracteres de un String");

        String texto = "";

        while (!texto.equals("salir")){
            texto = JOptionPane.showInputDialog("Introduce el texto ");
            JOptionPane.showMessageDialog(null, "el texto tiene " + texto.length() + " caracteres");
        }

        System.out.println("Has salido del programa1");


        // OPCION 2 CON do while


        String texto2="";
        do{
            texto2 = JOptionPane.showInputDialog("Introduce el texto2 ");
            JOptionPane.showMessageDialog(null, "el texto tiene " + texto2.length() + " caracteres");
        } while (!texto2.equals("salir"));

        System.out.println("Has salido del programa2");



    }
}
