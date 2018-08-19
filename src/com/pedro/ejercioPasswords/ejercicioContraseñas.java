package com.pedro.ejercioPasswords;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class ejercicioContraseñas {
    public static void main(String[] args) {


        //entrada num de contraseñas
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce número de contraseñas"));
        //array almacena contraseñas
        String[] miContrasenya = new String[num];

        //num de caracteres
        int lon = Integer.parseInt(JOptionPane.showInputDialog("Introduce número de caracteres"));

        //contruir contraseñas
        Password contrasenya = new Password(lon, "");
        for (int i = 0; i < num; i++) {
            miContrasenya[i] = contrasenya.generarPassword(lon, "");

        }


        //imrimir info de contraseñas
        System.out.println("Número de passwords: " + num + " con longitud de " + lon + " caracteres");
        for (int i = 0; i < num; i++) {
            System.out.println("Password " + (i+1) + " : " + miContrasenya[i] + " Longitud: " + miContrasenya[i].length() + " Seguridad: "  );
        }
    }


}
