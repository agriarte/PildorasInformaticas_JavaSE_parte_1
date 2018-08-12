package com.pedro.flujo;

import javax.swing.*;

public class while1 {
    public static void main(String[] args) {

        String clave = "Pedro";

        String acceso = "";

        while (!clave.equals(acceso)){
            acceso = JOptionPane.showInputDialog("Introduce la clace ");
            if (!clave.equals(acceso)){
                System.out.println("Clave incorrecta");
            }
        }
        System.out.println("Bienvenido a la zona de usuarios");
    }
}
