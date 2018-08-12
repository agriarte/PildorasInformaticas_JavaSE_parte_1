package com.pedro.flujo;

import javax.swing.*;

public class while_Ejercicio1 {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 100) + 1;
        int mi_num = 999;
        int contador = 1;

        while (num != mi_num) {
            mi_num = Integer.parseInt(JOptionPane.showInputDialog("Introduce num del 1 al 100"));
            if (num != mi_num) {
                contador++;
                if (mi_num < num){
                    System.out.println("error, es mayor");
                } else
                    System.out.println("error, es menor");
            }
        }
        System.out.println("Acertaste el numero en " + contador + " intentos");
    }
}
