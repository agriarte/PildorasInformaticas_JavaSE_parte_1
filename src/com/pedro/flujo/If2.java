package com.pedro.flujo;

import javax.swing.*;

public class If2 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:"));
        if ( edad <18) {
            System.out.println("Eres muy joven");
        } else if ( edad < 40){
            System.out.println("Eres joven");
        } else if ( edad < 65){
            System.out.println("Eres maduro");
        } else if (edad > 65) {
            System.out.println("Cuidate");
        }
    }
}
