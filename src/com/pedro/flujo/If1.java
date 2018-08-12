package com.pedro.flujo;

import javax.swing.*;

public class If1 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:"));
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }
}
