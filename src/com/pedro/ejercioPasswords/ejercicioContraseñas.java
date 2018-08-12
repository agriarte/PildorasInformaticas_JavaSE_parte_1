package com.pedro.ejercioPasswords;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class ejercicioContraseñas {
    public static void main(String[] args) {

        //entrada num de contraseñas
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce número de contraseñas"));

        //crear array[num]
        String[] contrasenya = new String[num];

        //num de caracteres
        int lon = Integer.parseInt(JOptionPane.showInputDialog("Introduce número de caracteres"));

        //contruir contraseñas


        //info de contraseñas
        imprimirInfoContrasenyas(num, lon, contrasenya);


    }

    private static void imprimirInfoContrasenyas(int num, int lon, String[] contrasenya) {
        System.out.println("Número de passwords: " + num + " con longitud de " + lon + " caracteres");
        for (int i = 0; i < num; i++) {
            System.out.println(contrasenya[i]);
        }


    }
}
