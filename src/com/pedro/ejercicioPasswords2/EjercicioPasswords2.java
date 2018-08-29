package com.pedro.ejercicioPasswords2;

import javax.swing.*;

public class EjercicioPasswords2 {
    public static void main(String[] args) {


        //entrada num de contraseñas
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce número de contraseñas"));

        //num de caracteres
        int lon = Integer.parseInt(JOptionPane.showInputDialog("Introduce número de caracteres"));

        //contruir contraseñas


        Password2[] contrasenya = new Password2[num];


        for (int i = 0; i < num; i++) {
            contrasenya[i] = new Password2(lon);
            contrasenya[i].generarPassword(lon, "");
        }


        //imrimir info de contraseñas
        System.out.println("Número de passwords: " + num + " con longitud de " + lon + " caracteres");
        for (int i = 0; i < num; i++) {
            System.out.println("Password " + (i+1) + " : " + contrasenya[i].getPassword() + " Longitud: " + contrasenya[i].getTamanyo() + " Seguridad: " + contrasenya[i].esSegura()  );
        }
    }


}

