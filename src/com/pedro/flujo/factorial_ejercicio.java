package com.pedro.flujo;

import javax.swing.*;

public class factorial_ejercicio {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero para factorial "));

        //factorial hecho por mi
        int factorial=1;
        while (num >=1 ){
            factorial=factorial*num;
            num--;
        }
        System.out.println(factorial);

        //factorial hecho PildorasInformaticas
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero para factorial "));
        long factorial2 = num2;
        for (int i = num2-1; i >0 ; i--) {
            factorial2=factorial2*i;
        }
        System.out.println(factorial2);






    }
}
